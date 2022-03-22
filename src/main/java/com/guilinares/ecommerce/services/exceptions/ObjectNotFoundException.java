package com.guilinares.ecommerce.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -3062803459648623681L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
