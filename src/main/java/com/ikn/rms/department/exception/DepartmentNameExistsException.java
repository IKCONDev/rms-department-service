package com.ikn.rms.department.exception;

public class DepartmentNameExistsException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 * @param errorCode
	 * @param errorMessage
	 */
	public DepartmentNameExistsException(String errorCode, String errorMessage) {
		super(errorMessage, new Throwable(errorCode));
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public DepartmentNameExistsException() {
		super();
	}

}
