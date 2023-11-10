public class ChessSquare extends GameSquare {

	public ChessSquare(int x, int y, GameBoard board) {
		super(x, y, "images/blank.png", board);
	}

    public void clicked() {}
}


/**
 * 
 * Objects
    ChessBoard inherits JFrame
        ActionListener Method
    ChessPiece (instance variables: ChessSquare, image)
        moveTo Method
        Knight inherits ChessPiece
        canMoveTo Method
        Queen inherits ChessPiece
        canMoveTo Method
        King inherits ChessPiece
        canMoveTo Method
        Pawn inherits ChessPiece
        canMoveTo Method
        Bishop inherits ChessPiece
        canMoveTo Method
        Rook inherits ChessPiece
        canMoveTo Method
    ChessSquare (instance variables: int x, int y) inherits JButton
 *
 */