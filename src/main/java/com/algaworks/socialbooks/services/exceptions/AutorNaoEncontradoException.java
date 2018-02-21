package com.algaworks.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1869300553614629710L;

	public AutorNaoEncontradoException(String menagem) {

		super(menagem);
	}

	public AutorNaoEncontradoException(String menagem, Throwable causa) {

		super(menagem);
	}
}
