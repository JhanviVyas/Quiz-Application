//  package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
 

public class Login extends JFrame implements ActionListener
{
    JButton rules, back;
    JTextField tfname;
    String name;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 640, 500);
        add(image);

        JLabel heading = new JLabel("Brain Master");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Segoe Script", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your name : ");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.PINK);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Exit");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 540);
        setLocation(200,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == rules) 
        {
            name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } 
        else if(ae.getSource() == back) 
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Login();
        //System.exit(0);
    }
}