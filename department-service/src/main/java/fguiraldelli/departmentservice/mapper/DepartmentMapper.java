package fguiraldelli.departmentservice.mapper;

import fguiraldelli.departmentservice.dto.DepartmentDto;
import fguiraldelli.departmentservice.entity.Department;

public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentoDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }

    public static Department mapToDepartment(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
        return department;
    }
}