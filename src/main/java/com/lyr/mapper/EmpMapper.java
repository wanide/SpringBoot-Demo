package com.lyr.mapper;

import com.lyr.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper {

    //查询所有员工信息
    List<Employee> getAllEmp();

    //新增员工信息
    int addEmp(Employee employee);

    //删除员工
    int deleteEmp(String name);

    //更新员工信息
    int updateEmp(Employee employee);

    //根据员工姓名查询员工信息
    Employee getEmpByName(String name);
}
