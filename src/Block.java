import java.awt.Color;
import java.awt.Graphics;

public class Block {

    public int colorIndex;

    public static Color[] colors;

    static {
        colors = new Color[]{
                Color.red,
                Color.blue,
                Color.magenta,
                Color.orange,
                Color.green,
                Color.cyan,
                Color.yellow
        };
    }

    public Block(int colorIndex){
        this.colorIndex = colorIndex;
    }

    public void draw(Graphics g, int scale, int x, int y){
        int px = x * scale + 1;
        int py = y * scale + 1;

        int size = scale -2;

        g.setColor(colors[colorIndex]);
        g.fillRect(px, py, size, size);

    }
}
