import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    // Constructor
    public Square(int x, int y, int w, int h, Color color){
        this.setBounds(x,y,w,h);
        this.setBackground(color);

    }

    //Methods
    public void paintComponent(Graphics g){
         g.drawOval(0,0,100,100);
         g.drawLine(0,0,100,100);
         g.drawLine(0,100,100,0);
    }
}
