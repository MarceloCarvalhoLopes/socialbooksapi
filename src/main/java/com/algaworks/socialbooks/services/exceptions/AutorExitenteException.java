package com.algaworks.socialbooks.services.exceptions;

public class AutorExitenteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1869300553614629710L;

	public AutorExitenteException(String menagem) {

		super(menagem);
	}

	public AutorExitenteException(String menagem, Throwable causa) {

		super(menagem);
	}
}
