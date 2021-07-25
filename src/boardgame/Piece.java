package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Esta linha não é necessária, pois o valor incial já é null 
	}
	
	protected Board getBoard() {
		return board;
	}
}
