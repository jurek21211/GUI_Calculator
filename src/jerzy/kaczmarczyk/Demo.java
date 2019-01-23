package jerzy.kaczmarczyk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo implements ActionListener {

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();

        if (target == b1 || target == t1) {

            int k = Integer.parseInt(t1.getText());
            t1.setText(Integer.toString(k * k));
            t1.requestFocus();

        } else if (target == b2) {

            t1.setText("");
            t1.requestFocus();

        } else if (target == b3) {

            int k = Integer.parseInt(t1.getText());
            int l = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(k + l));

        } else if (target == b4){

            int k = Integer.parseInt(t1.getText());
            int l = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(k - l));

        }
    }

    void init() {
        t1 = new JTextField(6);
        t2 = new JTextField(6);
        t3 = new JTextField(12);
        b3 = new JButton("+");
        b4 = new JButton("-");
        b1 = new JButton("^2");
        b2 = new JButton("clear");

        JPanel p = new JPanel();
        p.add(t1);
        p.add(t2);
        p.add(t3);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        JFrame f = new JFrame();
        Container c = f.getContentPane();
        c.add(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
