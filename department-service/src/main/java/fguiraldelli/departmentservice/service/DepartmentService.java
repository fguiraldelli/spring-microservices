package fguiraldelli.departmentservice.service;

import fguiraldelli.departmentservice.dto.DepartmentDto;
import fguiraldelli.departmentservice.entity.Department;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
