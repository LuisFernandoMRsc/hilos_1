package com.app.uv.Controller;

import com.app.uv.DTO.EmployeeDto;
import com.app.uv.Entidades.Employee;
import com.app.uv.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
@Autowired
    private EmployeeService employeeService;
@PostMapping
    public Employee createEmployee(@RequestBody EmployeeDto employeeDto) {}
}
