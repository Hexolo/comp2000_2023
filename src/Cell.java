import javax.swing.*;
import java.awt.*;

public class Cell {
    private int x, y, size;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    // public void paint(Graphics g) {
    // g.setColor(Color.BLACK);
    // g.drawRect(x, y, size, size);
    // }

    public void paint(Graphics g, Point mousePosition) {
        for (int x = 10; x < 710; x += 35) {
            for (int y = 10; y < 710; y += 35) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, size, size);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, size, size);
            }
        }

        if (mousePosition != null && contains(mousePosition)) {
            g.setColor(Color.GRAY);
            g.fillRect(x + 1, y + 1, size - 1, size - 1);
        }
    }

    private boolean contains(Point point) {
        return point.x >= x && point.x <= x + size && point.y >= y && point.y <= y + size;
    }
}
