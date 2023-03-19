package fguiraldelli.employeeservice.service;

import fguiraldelli.employeeservice.dto.APIResponseDto;
import fguiraldelli.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
