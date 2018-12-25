package com.examploDTO.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examploDTO.entity.Employee;
import com.examploDTO.service.EmployeeService;

@RequestMapping("/employeers")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
    public ResponseEntity<Employee> salvar(@RequestBody @Valid Employee employee) {
		Employee emp = employeeService.salvar(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
}
