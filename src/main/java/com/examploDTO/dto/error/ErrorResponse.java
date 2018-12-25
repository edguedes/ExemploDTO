package com.examploDTO.dto.error;

import java.util.List;

import org.springframework.validation.ObjectError;

public class ErrorResponse {

	private String message;
    private int code;
    private String status;
    private String objectName;
    private List<ObjectError> errors;
    
        
	public ErrorResponse(String message, int code, String status, String objectName, List<ObjectError> errors) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
		this.errors = errors;
	}
    
    
}
