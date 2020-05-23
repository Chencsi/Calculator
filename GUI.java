import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    //Frame és Panel
    public static JFrame f;
    public static JPanel p;

    //TextField
    public static JTextField tf1;

    //Labelek
    public static JLabel l1;
    public static JLabel l2;
    public static JLabel l0;

    //Gombok
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static JButton b5;
    public static JButton b6;
    public static JButton b7;
    public static JButton b8;
    public static JButton b9;
    public static JButton b0;

    //+
    public static JButton bo1;
    public int i_plus = 1;
    public String s_plus = String.valueOf(i_plus);

    //-
    public static JButton bo2;
    public int i_minus = 2;
    public String s_minus = String.valueOf(i_minus);

    //*
    public static JButton bo3;
    public int i_multi = 3;
    public String s_multi = String.valueOf(i_multi);

    //=
    public static JButton bo5;

    //C
    public static JButton bo6;

    public GUI() {

        //Panel és Frame beállításai
        p = new JPanel();
        f = new JFrame("Számológép");
        f.setSize(290,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setAlwaysOnTop(true);
        f.setLocationRelativeTo(null);
        f.add(p);

        //Réteg
        p.setLayout(null);

        //operaciok
        l0 = new JLabel();
        l0.setVisible(false);
        p.add(l0);

        //Label 1
        l1 = new JLabel("");
        l1.setBounds(20,10,100,20);
        p.add(l1);

        //Label 2
        l2 = new JLabel();
        l2.setBounds(290,10,100,20);
        p.add(l2);

        //TextField
        tf1 = new JTextField();
        tf1.setBounds(20,35,230,35);
        p.add(tf1);

        //1-es gomb
        b1 = new JButton("1");
        b1.setBounds(20,80,50,50);
        b1.addActionListener(this);
        p.add(b1);
        //2-es gomb
        b2 = new JButton("2");
        b2.setBounds(80,80,50,50);
        b2.addActionListener(this);
        p.add(b2);
        //3-as gomb
        b3 = new JButton("3");
        b3.setBounds(140,80,50,50);
        b3.addActionListener(this);
        p.add(b3);
        //4-es gomb
        b4 = new JButton("4");
        b4.setBounds(20,140,50,50);
        b4.addActionListener(this);
        p.add(b4);
        //5-os gomb
        b5 = new JButton("5");
        b5.setBounds(80,140,50,50);
        b5.addActionListener(this);
        p.add(b5);
        //6-os gomb
        b6 = new JButton("6");
        b6.setBounds(140,140,50,50);
        b6.addActionListener(this);
        p.add(b6);
        //7-es gomb
        b7 = new JButton("7");
        b7.setBounds(20,200,50,50);
        b7.addActionListener(this);
        p.add(b7);
        //8-as gomb
        b8 = new JButton("8");
        b8.setBounds(80,200,50,50);
        b8.addActionListener(this);
        p.add(b8);
        //9-es gomb
        b9 = new JButton("9");
        b9.setBounds(140,200,50,50);
        b9.addActionListener(this);
        p.add(b9);
        //0-as gomb
        b0 = new JButton("0");
        b0.setBounds(80,260,50,50);
        b0.addActionListener(this);
        p.add(b0);


            //+ gomb
        bo1 = new JButton("+");
        bo1.setBounds(200,80,50,50);
        bo1.addActionListener(this);
        p.add(bo1);
            //-  gomb
        bo2 = new JButton("-");
        bo2.setBounds(200,140,50,50);
        bo2.addActionListener(this);
        p.add(bo2);
            //*  gomb
        bo3 = new JButton("*");
        bo3.setBounds(200,200,50,50);
        bo3.addActionListener(this);
        p.add(bo3);
            //= gomb
        bo5 = new JButton("=");
        bo5.setBounds(140,260,110,50);
        bo5.addActionListener(this);
        p.add(bo5);
            //C gomb
        bo6 = new JButton("C");
        bo6.setBounds(20,260,50,50);
        bo6.addActionListener(this);
        p.add(bo6);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Számok
            //1
        if (e.getSource()==b1) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"1");
        }
            //2
        if (e.getSource()==b2) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"2");
        }
            //3
        if (e.getSource()==b3) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"3");
        }
            //4
        if (e.getSource()==b4) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"4");
        }
            //5
        if (e.getSource()==b5) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"5");
        }
            //6
        if (e.getSource()==b6) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"6");
        }
            //7
        if (e.getSource()==b7) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"7");
        }
            //8
        if (e.getSource()==b8) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"8");
        }
        //9
        if (e.getSource()==b9) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"9");
        }
        //0
        if (e.getSource()==b0) {
            String s_num1 = tf1.getText();
            tf1.setText(s_num1+"0");
        }

        //Operációk
        //+
        if (e.getSource()==bo1) {
            String s_op1 = tf1.getText();
            l1.setText(s_op1);
            l2.setText("+");
            l0.setText(s_plus);
            tf1.setText("");
        }
        //-
        if (e.getSource()==bo2) {
            String s_op1 = tf1.getText();
            l1.setText(s_op1);
            l2.setText("-");
            l0.setText(s_minus);
            tf1.setText("");
        }
        //*
        if (e.getSource()==bo3) {
            String s_op1 = tf1.getText();
            l1.setText(s_op1);
            l2.setText("*");
            l0.setText(s_multi);
            tf1.setText("");
        }
            //=
        if (e.getSource()==bo5) {
            String s_num1 = l1.getText();
            String s_num2 = tf1.getText();
            int i_num1 = Integer.parseInt(s_num1);
            int i_num2 = Integer.parseInt(s_num2);
            String op = l0.getText();
            int o = Integer.parseInt(op);
            //+
            if (o == 1) {
                int s_op5 = i_num1+i_num2;
                String i_op5 = String.valueOf(s_op5);
                l1.setText("");
                l2.setText("");
                tf1.setText(i_op5);
            }
            //-
            if (o == 2) {
                int s_op5 = i_num1-i_num2;
                String i_op5 = String.valueOf(s_op5);
                l1.setText("");
                l2.setText("");
                tf1.setText(i_op5);
            }
            //*
            if (o == 3) {
                int s_op5 = i_num1*i_num2;
                String i_op5 = String.valueOf(s_op5);
                l1.setText("");
                l2.setText("");
                tf1.setText(i_op5);
            }
        }
            //C
        if (e.getSource()==bo6) {
            String c = "";
            l1.setText(c);
            l2.setText(c);
            tf1.setText(c);
        }
    }
}
