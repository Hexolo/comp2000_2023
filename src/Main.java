import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private boolean highlighted = false;

    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
            Grid grid = new Grid(710, 710);
            Cell cell = new Cell(10, 10, 35);
            grid.paint(g);
            cell.paint(g, null);
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

}
