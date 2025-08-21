package com.app.uv.mappers;

import com.app.uv.DTO.EmployeeDto;
import com.app.uv.Entidades.Employee;

public class EmployeeMappers {
    public static EmployeeDto mapEmployeeToEmployeeDto(Employee employee) {
        return new  EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getAddress(),
                employee.getEmail(),
                employee.getPhone()
        );
    }
}
