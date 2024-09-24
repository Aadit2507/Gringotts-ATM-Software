package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;
import java.util.*;

public class Withdraw extends JFrame implements ActionListener {
     
    JButton Withdraw , back;
    JTextField amount;
    String pinnumber;
    Withdraw(String pinnumber){
     this.pinnumber = pinnumber;
         setLayout(null);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banklogoo.jpg"));
         Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 0, 900, 900);
         add(image);
         
         JLabel text = new JLabel("Enter the amount you want to Withdraw");
         text.setForeground(Color.WHITE);
         text.setFont((new Font("system", Font.BOLD , 16)));
         text.setBounds(185, 320, 400, 20);
         image.add(text);
         
          amount = new JTextField();
         amount.setFont(new Font ("Raleways", Font.BOLD , 22));
         amount.setBounds(170 , 360 , 320 , 25);
         amount.addActionListener(this);
         image.add(amount);
         
          Withdraw = new JButton("Withdraw");
         Withdraw.setBounds(359,530 , 150 , 30);
          Withdraw.addActionListener(this);
         image.add(Withdraw);
         
          back = new JButton("Back");
         back.setBounds(359 , 563 , 150 , 30);
         back.addActionListener(this);
         image.add(back);
         
          setSize(900 , 900);
    setLocation(300,0);
  // setUndecorated(true);
    setVisible(true);
         
     }
     
     public void actionPerformed(ActionEvent ae){
     
         if(ae.getSource()==Withdraw){
             
             String numb = amount.getText();
             Date date = new Date();
             if(numb.equals("")){
             JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdrawa");
             }else{
                 try{
                        Conn conn = new Conn();
             String query  =  "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+numb+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs "+numb+" has been Withdrawed succeessfully");
              setVisible(false);
          new Transactions(pinnumber).setVisible(true);
            
                 }catch(Exception e){
                 System.out.println(e);
                 }
         
             }
         
         }else if(ae.getSource()== back){
         
             setVisible(false);
           
          new Transactions(pinnumber).setVisible(true);
         }
     
     }
    
public static void main(String args[]){
new Withdraw("");

}    
}
