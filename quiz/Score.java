 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener 
{
    JButton back ,submit;

    Score(String name, int score) 
    {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 50, 300, 400);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + ", for playing Brain Master !!!");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Segoe Script", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Segoe Script", Font.PLAIN, 26));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Exit");
        back.setBounds(380, 350, 120, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == submit) 
        {
            setVisible(false);
            new Login();
        } 
        else if(ae.getSource() == back) 
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) 
    {
        new Score("User", 0);
    }
}
