package it.manytomanyjpamaven.exception;

public class UtenteConRuoliAssociatiException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UtenteConRuoliAssociatiException() {
		super();
	}
	public UtenteConRuoliAssociatiException(String messaggio) {
		super(messaggio);
	}

}
