package com.examploDTO.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examploDTO.dto.employee.EmployeeDTO;
import com.examploDTO.dto.response.EmployeeResponseDTO;
import com.examploDTO.entity.Employee;
import com.examploDTO.service.EmployeeService;

@RequestMapping("/employeers")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
		
	@PostMapping
    public ResponseEntity<EmployeeResponseDTO> salvar(@RequestBody @Valid EmployeeDTO dto) {
		Employee employee = employeeService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(EmployeeResponseDTO.transformaEmDTO(employee), HttpStatus.CREATED);
    }
}
