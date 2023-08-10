import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Grid {
    private int width, height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width, height);
    }
}
