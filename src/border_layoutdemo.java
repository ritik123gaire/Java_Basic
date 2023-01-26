import javax.swing.*;
import java.awt.*;

class BorderDemo extends JFrame {
    JButton b1,b2,b3,b4,b5;
    public void setBorder()
    {

        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Center");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);




    }

}
public class border_layoutdemo {
    public static void main(String[] args) {
        BorderDemo bd = new BorderDemo();
        bd.setBorder();
    }
   
}
