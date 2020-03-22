import java.awt.Color;

abstract class Piece {
    public String name;
    public Location location;
    public Color color;
    public Piece (String name, Location location, Color color) {
        this.name = name;
        this.location = location;
        this.color = color;
    }
    abstract void drawPiece();
}

class Square extends Piece {
    public Square(Location location, Color color){
        super("Square", location, color);
    }

    @Override
    public void drawPiece() {

    }
}