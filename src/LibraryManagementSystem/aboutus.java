package LibraryManagementSystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class about extends JFrame
{
	
 public about()
 {
	 
     
     super("About Us - Code for Interview");
     setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
     setBackground(new Color(173, 216, 230));
     setSize(700, 500);
     setLocationRelativeTo(null);
	 
     setVisible(true);
   
     JPanel contentPane = new JPanel();
     setContentPane(contentPane);
     contentPane.setLayout(null);
/*
     JLabel l1 = new JLabel("New label");
     ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
     Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     l1 = new JLabel(i3);
     l1.setBounds(500, 40, 100, 100);
     contentPane.add(l1);

*/
     JLabel l3 = new JLabel("Library Mangement System");
     l3.setForeground(new Color(165,42,42));
     l3.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 40));
     l3.setBounds(80, 60,600, 55);
     contentPane.add(l3);
     
     JLabel l6 = new JLabel("Developed By : Meenal and Juvita");
     l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
     l6.setBounds(90, 170, 600, 35);
     contentPane.add(l6);

     JLabel l7 = new JLabel("Contact Us : mjcoders@gmail.com");
     l7.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
     l7.setForeground(new Color(165,42,42));
     l7.setBounds(90, 260, 600, 34);
     contentPane.add(l7);

     JLabel l8 = new JLabel("Subscribe us on Youtube : MJ Coders");
     l8.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
     l8.setForeground(new Color(165,42,42));
     l8.setBounds(90, 290, 600, 34);
     contentPane.add(l8);

     JLabel l9 = new JLabel("Follow us on Instagram : mjcoders");
     l9.setFont(new Font("Mongolian Baiti", Font.BOLD , 20));
     l9.setBounds(90, 320, 600, 34);
     contentPane.add(l9);
     l9.setForeground(new Color(165,42,42));
     contentPane.setBackground(new Color(165,42,42));
     
     JPanel panel = new JPanel();
     panel.setBorder(new TitledBorder(new LineBorder(new Color(210,180,140), 2),null, TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(199,21,133)));
     panel.setBounds(20, 30,643,400);
     panel.setBackground(new Color(210,180,140));
     contentPane.add(panel);

}
 

 
	 
	 
 }







public class aboutus {

	public static void main(String[] args) {

       SwingUtilities.invokeLater(new Runnable() {
	
	    @Override
    	public void run() {
	
	    	about ab=new about();
	}
});
	}

}
