import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //Attributes

    //Constructor
    public Window(){
        WindowSettings();
        Addstuff();
        FinishWindow();
    }

    //Methods

    private void WindowSettings(){
        this.setBounds(300, 200, 600, 400);
        this.setLayout(null);
    }
    private void FinishWindow() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }
    private void Addstuff(){
        Square sq1 = new Square(0,0,100,100, Color.blue);
        //Square sq2 = new Square(100,100,50,50,Color.cyan);

        JTextField text = new JTextField();
        text.setBounds(100,100,100,100);

        this.add(sq1);
        //this.add(sq2);
        this.add(text);
    }

    //Setters and getters
}
