package com.lyr.controller;


import com.lyr.pojo.Employee;
import com.lyr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    //查询员工
    @RequestMapping("/queryEmp")
    public String showEmployee(String name, Model model){
        if(!name.equals("")){
            Employee emp = empService.getEmpByName(name);
            model.addAttribute("emp",emp);
            return "show";
        }else {
            //输入为空时显示所有用户
            return "redirect:/showAll";
        }

    }

    //查询所有用户
    @RequestMapping("/showAll")
    public String showAll(Model model){
        List<Employee> allEmp = empService.getAllEmp();
        model.addAttribute("emp",allEmp);
        return "show";
    }

    //新增用户信息
    @RequestMapping("/toAddEmp")
    public String toAddEmp(){
        return "addEmp";
    }

    @RequestMapping("/addEmp")
    public String addEmp(Employee employee){
        empService.addEmp(employee);
        return "show";
    }

    //跳转到修改用户信息页面
    @RequestMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name")String name,Model model){
        Employee emp = empService.getEmpByName(name);
        model.addAttribute("emp",emp);
        return "updateEmp";
    }

    //修改员工信息
    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee,Model model){
        empService.updateEmp(employee);
        return "show";
    }

    //删除用户信息
    @RequestMapping("/deleteEmp/{name}")
    public String deleteEmp(@PathVariable("name")String name){
        empService.deleteEmp(name);
        return "show";
    }


}
