package org.maxwell.recipe.exceptions;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7540080042889697140L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}