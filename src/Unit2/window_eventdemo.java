package Unit2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class windowdemo extends JFrame{
    JTextField t1,t2;
    JLabel l1;
    public void SetWindow() {
        t1 = new JTextField(20);
        t2 =  new JTextField(20);
        l1 = new JLabel("Result");
        add(t1);
        add(t2);
        add(l1);
        t1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                l1.setText("Focus Gained");

            }

            @Override
            public void focusLost(FocusEvent e) {
                l1.setText("Focus Lost");
            }
        });
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window is Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window is Closed");

            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Maximized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window  Minimized");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activate");

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivate");
            }
        });

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class window_eventdemo {
    public static void main(String[] args) {
        windowdemo wd = new windowdemo();
        wd.SetWindow();
    }
}
