package jerzy.kaczmarczyk;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Kalk implements ActionListener {
    boolean minusPressed = false;
    boolean plusPressed = false;
    boolean asteriskPressed = false;
    boolean backSlashPressed = false;
    boolean commaPressed = false;
    boolean rowPressed = false;
    boolean procPressed = false;
    JTextField t1;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;


    JButton bplus, brow, bminus, basterisk, bbackslash, bcomma, bclear, baclear, bsqrt, bpow2, bproc, bmeplus, bme;

    double x = 0, buf = 0, mem = 0;


    public void actionPerformed(ActionEvent e) {
        Object target = e.getSource();


        if (target == b1) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();

        } else if (target == b2) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b3) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b4) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b5) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b6) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b7) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b8) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b9) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == b0) {
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText(t1.getText() + ((JButton) target).getText());
            t1.requestFocus();
        } else if (target == bplus) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                procPressed = false;
            }
            t1.setText("");
            t1.requestFocus();
            plusPressed = true;
            commaPressed = false;
        } else if (target == bminus && t1.getText().length() != 0) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                procPressed = false;
            }
            t1.setText("");
            t1.requestFocus();
            minusPressed = true;
            commaPressed = false;
        } else if (target == basterisk) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                buf = buf / 100;
                procPressed = false;
            }
            t1.setText("");
            t1.requestFocus();
            asteriskPressed = true;
            commaPressed = false;
        } else if (target == bbackslash) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                buf = buf / 100;
                procPressed = false;
            }
            t1.setText("");
            t1.requestFocus();
            backSlashPressed = true;
            commaPressed = false;
        } else if (target == bsqrt) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                procPressed = false;
            }
            buf = Math.sqrt(buf);
            t1.setText(Double.toString(buf));
            t1.requestFocus();
            commaPressed = false;
            buf = 0;
        } else if (target == bpow2) {
            buf = Double.parseDouble(t1.getText());
            if (procPressed) {
                procPressed = false;
            }
            if (buf < 0.0) {
                t1.setText("Only positive numbers! Press C or AC.");
            } else {
                buf = Math.pow(buf, 2);
                t1.setText(Double.toString(buf));
            }
            t1.requestFocus();
            buf = 0;
        } else if (target == bminus && t1.getText().length() == 0) {
            if (procPressed) {
                procPressed = false;
            }
            if (rowPressed) {
                t1.setText("");
                t1.requestFocus();
                rowPressed = false;
            }
            t1.setText("-");
            t1.requestFocus();
        } else if (target == brow || target == t1) {
            rowPressed = true;
            if (minusPressed) {
                x = Double.parseDouble(t1.getText());
                if (procPressed) {
                    procPressed = false;
                }
                x = buf - x;
                t1.setText(Double.toString(x));
                t1.requestFocus();
                minusPressed = false;
                commaPressed = false;
                buf = 0;
            }
            if (plusPressed) {
                x = Double.parseDouble(t1.getText());
                if (procPressed) {
                    procPressed = false;
                }
                x = buf + x;
                t1.setText(Double.toString(x));
                t1.requestFocus();
                plusPressed = false;
                commaPressed = false;
                buf = 0;
            }
            if (asteriskPressed) {
                x = Double.parseDouble(t1.getText());
                if (procPressed) {
                    x = x / 100;
                    procPressed = false;
                }
                x = buf * x;
                t1.setText(Double.toString(x));
                t1.requestFocus();
                asteriskPressed = false;
                commaPressed = false;
                buf = 0;
            }
            if (backSlashPressed) {
                x = Double.parseDouble(t1.getText());
                if (procPressed) {
                    x = x / 100;
                    procPressed = false;
                }
                System.out.println(x);
                if (x == 0.0) {
                    t1.setText("Do not divide by 0! Press C or AC.");
                } else {
                    x = buf / x;
                    t1.setText(Double.toString(x));
                }

                t1.requestFocus();
                backSlashPressed = false;
                commaPressed = false;
                buf = 0;
            }

        } else if (target == bcomma && commaPressed == false) {
            t1.setText(t1.getText() + ((JButton) target).getText());
            commaPressed = true;
        } else if (target == bclear) {

            if (buf != 0) {
                t1.setText(Double.toString(buf));
            } else {
                t1.setText("");
            }
            minusPressed = false;
            plusPressed = false;
            commaPressed = false;
            asteriskPressed = false;
            backSlashPressed = false;

        } else if (target == baclear) {
            t1.setText("");
            t1.requestFocus();
            buf = 0;
            minusPressed = false;
            plusPressed = false;
            commaPressed = false;
            asteriskPressed = false;
            backSlashPressed = false;
        } else if (target == bproc) {
            procPressed = true;
        } else if (target == bmeplus) {
            if (t1.getText().length() != 0)
                mem = Double.parseDouble(t1.getText());
        } else if (target == bme) {
            if (mem != 0) {
                t1.setText(Double.toString(mem));
                t1.requestFocus();
            }
        }

    }

    void init() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        JFrame f = new JFrame();
        Container c = f.getContentPane();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.setLayout(gbl);


        t1 = new JTextField(15);
        t1.addActionListener(this);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setEditable(false);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (Character.isDigit(c) == true) {
                    t1.setText(t1.getText() + c);
                }

            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.ipadx = 0;
        gbc.ipady = 5;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(t1, gbc);
        c.add(t1);


        b1 = new JButton("1");
        b1.addActionListener(this);
        b1.setFocusable(false);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b1, gbc);
        c.add(b1);
//b2
        b2 = new JButton("2");
        b2.addActionListener(this);
        b2.setFocusable(false);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b2, gbc);
        c.add(b2);

        b3 = new JButton("3");
        b3.addActionListener(this);
        b3.setFocusable(false);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b3, gbc);
        c.add(b3);

        b4 = new JButton("4");
        b4.addActionListener(this);
        b4.setFocusable(false);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b4, gbc);
        c.add(b4);

        b5 = new JButton("5");
        b5.addActionListener(this);
        b5.setFocusable(false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b5, gbc);
        c.add(b5);

        b6 = new JButton("6");
        b6.addActionListener(this);
        b6.setFocusable(false);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b6, gbc);
        c.add(b6);

        b7 = new JButton("7");
        b7.addActionListener(this);
        b7.setFocusable(false);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b7, gbc);
        c.add(b7);

        b8 = new JButton("8");
        b8.addActionListener(this);
        b8.setFocusable(false);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b8, gbc);
        c.add(b8);

        b9 = new JButton("9");
        b9.addActionListener(this);
        b9.setFocusable(false);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b9, gbc);
        c.add(b9);

        b0 = new JButton("0");
        b0.addActionListener(this);
        b0.setFocusable(false);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 0);
        gbl.setConstraints(b0, gbc);
        c.add(b0);

        bplus = new JButton("+");
        bplus.addActionListener(this);
        bplus.setFocusable(false);
        bplus.setToolTipText("Summ");
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(bplus, gbc);
        c.add(bplus);

        bminus = new JButton("-");
        bminus.addActionListener(this);
        bminus.setFocusable(false);
        bminus.setToolTipText("Substract");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(bminus, gbc);
        c.add(bminus);


        basterisk = new JButton("*");
        basterisk.addActionListener(this);
        basterisk.setFocusable(false);
        basterisk.setToolTipText("Multiply");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(basterisk, gbc);
        c.add(basterisk);


        bbackslash = new JButton("/");
        bbackslash.addActionListener(this);
        bbackslash.setFocusable(false);
        bbackslash.setToolTipText("Divide");
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(bbackslash, gbc);
        c.add(bbackslash);

        bcomma = new JButton(".");
        bcomma.addActionListener(this);
        bcomma.setFocusable(false);
        bcomma.setToolTipText(",");
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(bcomma, gbc);
        c.add(bcomma);

        bclear = new JButton("C");
        bclear.addActionListener(this);
        bclear.setFocusable(false);
        bclear.setToolTipText("Clear and return previous Value");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(bclear, gbc);
        c.add(bclear);

        baclear = new JButton("AC");
        baclear.addActionListener(this);
        baclear.setFocusable(false);
        baclear.setToolTipText("Clear and start again");
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 0, 5);
        gbl.setConstraints(baclear, gbc);
        c.add(baclear);


        brow = new JButton("=");
        brow.addActionListener(this);
        brow.setFocusable(false);
        brow.setToolTipText("Calculate");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(brow, gbc);
        c.add(brow);

        bsqrt = new JButton("\u221A");
        bsqrt.addActionListener(this);
        bsqrt.setFocusable(false);
        bsqrt.setToolTipText("Square root");
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(bsqrt, gbc);
        c.add(bsqrt);

        bpow2 = new JButton("X\u00B2");
        bpow2.addActionListener(this);
        bpow2.setFocusable(false);
        bpow2.setToolTipText("Square root");
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(bpow2, gbc);
        c.add(bpow2);

        bproc = new JButton("%");
        bproc.addActionListener(this);
        bproc.setFocusable(false);
        bproc.setToolTipText("Percentage");
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(bproc, gbc);
        c.add(bproc);


        bmeplus = new JButton("ME+");
        bmeplus.addActionListener(this);
        bmeplus.setFocusable(false);
        bmeplus.setToolTipText("Add to memory");
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(bmeplus, gbc);
        c.add(bmeplus);

        bme = new JButton("ME");
        bme.addActionListener(this);
        bme.setFocusable(false);
        bme.setToolTipText("Read from memory");
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.ipadx = 30;
        gbc.ipady = 0;
        gbc.insets = new Insets(5, 5, 5, 0);
        gbl.setConstraints(bme, gbc);
        c.add(bme);

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Calculator");
        f.setVisible(true);
    }
}