package boardgame;

//RuntimeException para ser uma exceção opcional de ser tratada
public class BoardException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);
	}
}
