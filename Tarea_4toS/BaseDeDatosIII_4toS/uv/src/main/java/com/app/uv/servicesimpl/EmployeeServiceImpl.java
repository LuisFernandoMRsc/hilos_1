package com.app.uv.servicesimpl;

import com.app.uv.DTO.EmployeeDto;
import com.app.uv.Entidades.Employee;
import com.app.uv.Repository.EmployeeRepository;
import com.app.uv.mappers.EmployeeMappers;
import com.app.uv.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDTO) {
        Employee employee = EmployeeMappers.mapEmployeeDTOToEmployee(employeeDTO);

        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMappers.mapEmployeeToEmployeeDTO(savedEmployee);

        //return EmployeeMapper.mapEmployeeToEmployeeDTO(employeeRepository.save(employee));
    }
}