package Chess;

public class King extends Piece {

    private boolean castling = false;


    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        int xmove, ymove = 0;
        xmove = end.getX() - start.getX() >= 0 ? end.getX() - start.getX() : -(end.getX() - start.getX());
        ymove = end.getY() - start.getY() >= 0 ? end.getY() - start.getY() : -(end.getY() - start.getY());
        return xmove + ymove == 1;
    }

    public boolean isCastling() {
        return castling;
    }

    public void setCastling(boolean castling) {
        this.castling = castling;
    }

    public void isValidCasting(Spot start, Spot end) {
        
    }
}

