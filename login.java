package quiz.appli.ction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField jfname;

    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("simple minds");
        heading.setBounds(700, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(750, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(Color.blue);
        add(name);

        jfname = new JTextField();
        jfname.setBounds(730, 180, 200, 20);
        jfname.setForeground(Color.black);
        jfname.setBackground(Color.pink);
        jfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(jfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 250, 70, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(850, 250, 70, 25);
        back.setBackground(new Color(30, 144, 254));
        back.addActionListener(this);
        add(back);

        setSize(1000, 500);
        setLocation(200, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = jfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);

        }

    }

    public static void main(String args[]) {
        new Login();
    }

}
