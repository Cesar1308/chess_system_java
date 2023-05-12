package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	//Matriz de peças
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

	
	// vai retornar a matriz pieces na linha row e na coluna column
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	//sobrecarga do metodo 
	public Piece piece(Position position) {
		if(!positionExists(position)){
			throw new BoardException("Position not on the borad");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	//metodo que coloca a peça em uma determinada posição
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0  &&  row < rows  &&  column >= 0  && column < columns; 
	}
	
	public boolean positionExists(Position position){
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)){
			throw new BoardException("Position not on the borad");
		}
		return piece(position) != null;
	}
}
