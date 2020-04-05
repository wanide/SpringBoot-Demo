package com.lyr.service;

import com.lyr.mapper.EmpMapper;
import com.lyr.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Employee> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public int addEmp(Employee employee) {
        return empMapper.addEmp(employee);
    }

    @Override
    public int deleteEmp(String name) {
        return empMapper.deleteEmp(name);
    }

    @Override
    public int updateEmp(Employee employee) {
        return empMapper.updateEmp(employee);
    }

    @Override
    public Employee getEmpByName(String name) {
        return empMapper.getEmpByName(name);
    }
}
