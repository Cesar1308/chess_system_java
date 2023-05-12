package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position recebe null pois é a posição inicial da peça
		position = null;
	}

	// somente classes do mesmo pacote e sub-classes poderam acessar
	protected Board getBoard() {
		return board;
	}

		
}
