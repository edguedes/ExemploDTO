package com.examploDTO.dto.response;

import com.examploDTO.entity.Employee;

public class EmployeeResponseDTO {
	
	/*
	 Classe Response que retornar apenas os atributos desejados
	*/
	
	private Long id;
    private String nome;
    private String email;
    private boolean admin;
    
        
	public EmployeeResponseDTO(Long id, String nome, String email, boolean admin) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.admin = admin;
	}
	
	// Metodo para trnasformar Empployee e retorna a propria classe
	public static EmployeeResponseDTO transformaEmDTO(Employee employee) {
	    return new EmployeeResponseDTO(
	    		employee.getId(), 
	    		employee.getNome(), 
	    		employee.getEmail(), 
	    		employee.isAdmin());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
    
    
    
}
