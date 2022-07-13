package br.com.app_cadastro.exception;

import org.springframework.security.core.AuthenticationException;

public class InavlidJwtAuthenticationException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InavlidJwtAuthenticationException(String msg) {
		super(msg);
	}

}
