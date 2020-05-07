package upc.edu.etsetb.softarch.multigame.server.domain;

public class PlayerException extends Exception{
	public PlayerException() {}
	public PlayerException(String ErrorMessage) {
		super(ErrorMessage);
	}
}