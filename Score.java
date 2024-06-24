
package quiz.appli.ction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
  
    Score(String name,int score){
        setBounds(300, 150, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

         JLabel heading= new JLabel("Thank You "+name+" For Playing Rohit Salunkhe's game SIMPLE MINDS");
        heading.setBounds(30, 30,800, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);
        
        
        JLabel lblscore= new JLabel("YOUR BEST SCORE IS "+score+" all the best");
        lblscore.setBounds(250, 130,550, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);
        
        JButton  submit = new JButton("play again");
        submit.setBounds(350, 190, 220, 30);
        submit.setFont(new Font("Arial", Font.BOLD, 20));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        
        add(submit);
       
        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    
    public static void main(String [] args)
  {
      new Score("user",0);
  }
}
