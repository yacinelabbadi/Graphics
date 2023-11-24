import javax.swing.*;
import java.awt.*;
import java.sql.Time;

public class Window extends JFrame {
    public Window(){
        //Constructor
        this.setBounds(500,7,500,500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Digital Clock");
        this.setLayout(null);
        Addstuff();
    }

    private void Addstuff() {
        //addhours
        TimeSquare hours = new TimeSquare();
        this.add(hours);
        //addminutes
        //TimeSquare minutes = new TimeSquare();
        //addseconds
        //TimeSquare seconds = new TimeSquare();
    }
}
