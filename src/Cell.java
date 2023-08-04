import javax.swing.*;
import java.awt.*;

public class Cell {
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
         g.drawRect(10, 10, 35, 35);
        // for(int i=10; i<710; i+=35) {
        //     for(int j=10; j<710; j+=35) {
                // g.setColor(Color.BLACK);
        //         // g.drawRect(i, j, 35, 35);
        //     }   
        // }
    }
}
