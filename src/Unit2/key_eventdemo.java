package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyExample extends JFrame{
    JTextField t1;
    JLabel l1,l2,l3;
    public void setKey(){
        t1 = new JTextField(20);
        l1 = new JLabel("Result");
        l2 = new JLabel("Result");
        l3 = new JLabel("Result");
        add(t1);
        add(l1);
        add(l2);
        add(l3);
        t1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                l1.setText("Key Typed"+e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l2.setText("Key Pressed is "+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                l3.setText("Key Released is "+e.getKeyChar());
            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class key_eventdemo {
    public static void main(String[] args){
        KeyExample k1 = new KeyExample();
        k1.setKey();
    }
}
