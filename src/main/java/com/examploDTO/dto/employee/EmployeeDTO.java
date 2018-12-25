package com.examploDTO.dto.employee;

import com.examploDTO.entity.Employee;

public class EmployeeDTO {
	
	private String nome;
    private String email;
    private String senha;
    
    /*
     Com USO do DTO, criamos o objeto com os campos que interessa 
    */
    public Employee transformaParaObjeto(){
        return new Employee(nome, email, senha);
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
    
    
}
