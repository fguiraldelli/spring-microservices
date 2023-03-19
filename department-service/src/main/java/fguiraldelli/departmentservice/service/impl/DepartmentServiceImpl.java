package fguiraldelli.departmentservice.service.impl;

import fguiraldelli.departmentservice.dto.DepartmentDto;
import fguiraldelli.departmentservice.entity.Department;
import fguiraldelli.departmentservice.mapper.DepartmentMapper;
import fguiraldelli.departmentservice.repository.DepartmentRepository;
import fguiraldelli.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentoDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentoDto(department);

        return departmentDto;
    }
}
