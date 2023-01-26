/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dipesh
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class UserInputDemo extends JFrame{ //for windows
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;
    public void setComponent(){
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("result");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b1 = new JButton("Add");
        
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(b1);
      add(l3);
      //handling action event
      b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            //extracting data from textfield
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int sum = num1+num2;
            l3.setText("The sum is "+String.valueOf(sum)); 
            }
            
        });
      
      //prropety windows  
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
    
    
    
}



public class userinput {
    public static void main(String[] args){
        UserInputDemo userInp = new UserInputDemo();
        userInp.setComponent();
    }
    
}
