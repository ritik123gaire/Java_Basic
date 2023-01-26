package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseForm extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setMouse()
    {
        t1=new JTextField(30);
        l1=new JLabel("RESULT");
        add(t1);
        add(l1);
        //handling mouse event
        t1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse is CLicked At "+e.getX()+","+e.getY());//mouse  direction
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("Mouse is Pressed At "+e.getX()+","+e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("Mouse is Released At "+e.getX()+","+e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("Mouse is Entered At "+e.getX()+","+e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("Mouse is CLicked At "+e.getX()+","+e.getY());
            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class MouseEventDemo {
    public static void main(String[] args) {
        MouseForm f1 = new MouseForm();
        f1.setMouse();
    }
}

