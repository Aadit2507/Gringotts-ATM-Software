package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,clear , signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
  Login(){
      setTitle("AUTOMATED TELLR MACHINE");
      
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
      Image i2 = i1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel label = new JLabel(i3);
      label.setBounds(80,10,100,100);
      add(label);
      
      JLabel text = new JLabel("welcome to Gringotts");
      text.setFont(new Font("osward", Font.BOLD, 40));
      text.setBounds(200 , 25 , 500 , 55);
      add(text);
      
      JLabel cardno = new JLabel("Card No:");
      cardno.setFont(new Font("Raleway", Font.BOLD, 28));
      cardno.setBounds(200 , 100 , 400 , 50);
      add(cardno);
     
       cardTextField = new JTextField();
      cardTextField.setBounds(350 , 113 , 250 , 30);
      cardTextField.setFont(new Font("Arial",Font.BOLD,14));
          add(cardTextField);
      JLabel pin = new JLabel("PIN:");
      pin.setFont(new Font("raleway", Font.BOLD, 28));
      pin.setBounds(200 , 160 , 400 , 50);
      add(pin);
      
       pinTextField = new  JPasswordField();
      pinTextField.setBounds(350 , 170 , 250 , 30);
       pinTextField.setFont(new Font("Arial",Font.BOLD,14));
          add(pinTextField);
          
            clear = new JButton("CLEAR");
          clear.setBounds(490 , 250 , 110 , 30);
          clear.setBackground(Color.black);
           clear.setForeground(Color.white);
           clear.addActionListener(this);
          add(clear);
          
          
            signup = new JButton("SIGN UP");
          signup.setBounds(350, 300 , 250 , 30);
          signup.setBackground(Color.black);
           signup.setForeground(Color.white);
           signup.addActionListener(this);
          add(signup);
      
           login = new JButton("SIGN IN");
          login.setBounds(350 , 250 , 110 , 30);
          login.setBackground(Color.black);
           login.setForeground(Color.white);
           login.addActionListener(this);
          add(login);
          
      getContentPane().setBackground(Color.WHITE);
      
  setSize(800 ,400);
  setVisible(true);
  setLocation(350 ,200);
  }  
    
  public void actionPerformed(ActionEvent ae){
  if(ae.getSource()== clear){
  cardTextField.setText("");
   pinTextField.setText("");
  
 }else if(ae.getSource()== signup){
 setVisible(false);
    new Signupone( ).setVisible(true);
 }else if(ae.getSource()== login){
 Conn conn = new Conn();
String cardnumber = cardTextField.getText(); 
String pinnumber = pinTextField.getText();
String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' " ;
 try{
     ResultSet rs = conn.s.executeQuery(query);
     if(rs.next()){
     setVisible(false);
     new Transactions(pinnumber).setVisible(true);
     }else{
     JOptionPane.showMessageDialog(null ,"Incorrect , card Number or Pin");
     }
 }catch(Exception e){
 System.out.println(e);
 }

 }
  }
public static void main(String args[])
{
new Login();
}
}
