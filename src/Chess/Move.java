package Chess;

public class Move {

    private Spot startSpot;
    private Spot endSpot;
    private Player player;


    public Move(Spot startSpot, Spot endSpot, Player player) {
        this.startSpot = startSpot;
        this.endSpot = endSpot;
        this.player = player;
    }

    public Spot getStartSpot() {
        return startSpot;
    }

    public void setStartSpot(Spot startSpot) {
        this.startSpot = startSpot;
    }

    public Spot getEndSpot() {
        return endSpot;
    }

    public void setEndSpot(Spot endSpot) {
        this.endSpot = endSpot;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
