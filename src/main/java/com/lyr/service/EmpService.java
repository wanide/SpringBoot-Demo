package com.lyr.service;

import com.lyr.pojo.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> getAllEmp();

    int addEmp(Employee employee);

    int deleteEmp(String name);

    int updateEmp(Employee employee);

    Employee getEmpByName(String name);
}
