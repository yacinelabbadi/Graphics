import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    // Constructor
    public Square(int x, int y, int w, int h, Color color){
        this.setBounds(x,y,w,h);
        this.setBackground(color);
    }
}
