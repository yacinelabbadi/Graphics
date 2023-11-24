import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class TimeSquare extends JPanel {
    //Attributes
    String time;

    public TimeSquare() {
        this.setBounds(100,100,500,500);


    }

    @Override
    public void paintComponent(Graphics g) {
        getTime();
        g.setColor(Color.white);
        g.fillRect(0,0 ,1000,1000);
        System.out.println("Graphics");
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(time,100,100);
        repaint();
    }

    public void getTime() {

        LocalTime myObj = LocalTime.now();
        this.time = myObj.getHour() + ":" + myObj.getMinute() + ":" + myObj.getSecond();
        System.out.println("time");
    }

}
