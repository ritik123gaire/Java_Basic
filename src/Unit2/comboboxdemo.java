package Unit2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

class Combo extends JFrame {
    JComboBox j1;
    JList j2;
    JLabel l1, l2;
    JTable tb1;

    public void setFrame() {
        String country[] = {"NEPAL", "INDIA", "CHINA", "BANGLADESH"};
        String course[] = {"BIM", "BCA", "BIT", "CSIT", "BBS", "BBM", "MBBS", "BSCIT", "ER", "CS", "AGR", "FR"};
    //for table header
        String [] header = {"id","Name","Gender","Faculty","Grade"};
        String [] [] data = {
                {"1","Ram","Male","Csit","A+"},
                {"2","Balram","Male","Csit","A+"},
                {"3","Sita","Female","BCA","B"},
                {"4","Hari","Male","Bim","B-"},
                {"5","Shyam","Male","Csit","A-"},
                {"6","Lakshman","Male","Csit","A"},
                {"7","Mani","Male","Csit","B+"},
                {"8","Kushal","Male","Csit","B+"},
                {"9","Rohit","Male","Csit","C+"},
                {"10","Saroj","Male","Bim","A"}
        };

        j1 = new JComboBox(country);
        j2 = new JList(course);
        l1 = new JLabel("Result For combo box");
        l2 = new JLabel("Result FOr List");
        tb1 = new JTable(data,header);
        tb1.setPreferredScrollableViewportSize(new Dimension(250,100));

        JScrollPane sc = new JScrollPane(j2);
        JScrollPane sc1 = new JScrollPane(tb1);
        add(l1);
        add(j1);
        add(l2);
        add(sc);
        add(sc1);
//        add(tb1);

//selection mode:0 single , 2 :multiple , 1 single with interval
        j2.setSelectionMode(2);
        //combo throw two events : action and item event
        j1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String country = (String) j1.getSelectedItem();//to abstract selected data
                l1.setText("Your country is" + country);
            }
        });

        //event handling for Jlist
        //list selection event

        j2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //j2.getSelectedValuesList();
                String str = "";
                ArrayList<String> st = (ArrayList)j2.getSelectedValuesList();
                for(String var:st){
                    str+=var;
                }
                l2.setText("Your Courses are "+str+" , ");
            }
        });

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(3);


    }


}

public class comboboxdemo {
    public static void main(String[] args) {
        Combo lc = new Combo();
        lc.setFrame();

    }
}
