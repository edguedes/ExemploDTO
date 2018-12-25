package com.examploDTO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examploDTO.entity.Employee;
import com.examploDTO.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

    public Employee salvar(Employee employee) {
        return employeeRepository.save(employee);
    }
}
