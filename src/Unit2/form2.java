package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;

    JButton b1;

    public void setForm(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Repassword");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Result");
        t1=new JTextField(30);
        p1 = new JPasswordField(30);
        p2 =  new JPasswordField(30);
        r1 =  new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("Java");
        b1 = new JButton("Submit");

        //adding components to window

        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(l3);
        add(p2);
        add(l3);
        add(p2);
        add(l4);
        add(r1);
        add(r2);
        add(l5);
        add(c1);
        add(c2);
        add(c3);
        add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = "";
                res += "Your Username is"+t1.getText()+"Your Password is"+p1.getText() + "Your Re-password is" + p2.getText()
                ;
                if(r1.isSelected()){
                    res+=r1.getText();
                }else{
                    res+=r2.getText();
                }
                if(c1.isSelected()){
                    res+=c1.getText();
                }
                if(c2.isSelected()){
                    res+=c2.getText();
                }
                if(c3.isSelected()){
                    res+=c3.getText();
                }

                l6.setText(res);


            }
        });
    //using component of window
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
public class form2 {
    public static void main(String[] args){
        Form f1 = new Form();
        f1.setForm();
    }
    
}
