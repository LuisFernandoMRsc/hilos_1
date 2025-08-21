package com.app.uv.service;

import com.app.uv.DTO.EmployeeDto;
import com.app.uv.Entidades.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);
    Employee updateEmployee(EmployeeDto employeeDto);
    void deleteEmployee(EmployeeDto employeeDto);
    Employee findEmployee(Long id);
    List<Employee> findAllEmployees();
}
