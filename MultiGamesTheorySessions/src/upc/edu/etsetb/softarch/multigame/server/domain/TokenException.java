package upc.edu.etsetb.softarch.multigame.server.domain;

public class TokenException extends Exception{
	public TokenException() {}
	public TokenException(String ErrorMessage) {
		super(ErrorMessage);
	}
}