package upc.edu.etsetb.softarch.multigame.server.domain;

public class BoardException extends Exception{
	public BoardException() {}
	public BoardException(String ErrorMessage) {
		super(ErrorMessage);
	}
}
