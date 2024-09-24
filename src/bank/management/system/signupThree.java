
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signupThree extends JFrame implements ActionListener{
    JRadioButton r1 , r2 , r3, r4;
    JCheckBox c1 , c2 ,c3 , c4 , c5 , c6  , c7;
    JButton submit , cencle ;
    String formno;
    signupThree( String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3 ");
       JLabel l1 = new JLabel("Page 3: Account Details");
       l1.setFont(new Font("Raleway",Font.BOLD,22));
       l1.setBounds(280 ,40, 400 , 40);
       add(l1);
       
       JLabel type  = new JLabel ("Account Type :");
       type.setFont(new Font("Raleway", Font.BOLD , 22));
           type.setBounds(100 , 140 , 200 , 30);
           add(type);
           
           r1 = new JRadioButton("saving Account");
           r1.setBounds(100 , 180 , 150 , 20);
           r1.setFont( new Font("Raleway" , Font.BOLD , 16));
           r1.setBackground(Color.white);
           add(r1);
           
           r2 = new JRadioButton("Fixed Deposit Account");
           r2.setBounds(350 , 180 , 250 , 20);
           r2.setFont( new Font("Raleway" , Font.BOLD , 16));
           r2.setBackground(Color.white);
           add(r2);
           
           r3 = new JRadioButton("Current Account");
           r3.setBounds(100 , 220 , 250 , 20);
           r3.setFont( new Font("Raleway" , Font.BOLD , 16));
           r3.setBackground(Color.white);
           add(r3);
           
           r4 = new JRadioButton("Recurring Deposit Account");
           r4.setBounds(350 , 220 , 250 , 20);
           r4.setFont( new Font("Raleway" , Font.BOLD , 16));
           r4.setBackground(Color.white);
           add(r4);
           
           
           ButtonGroup groupaccount = new ButtonGroup();
           groupaccount.add(r1);
           groupaccount.add(r2);
           groupaccount.add(r3);
           groupaccount.add(r4);

            JLabel card  = new JLabel ("Card Number :");
       card.setFont(new Font("Raleway", Font.BOLD , 22));
           card.setBounds(100 , 300 , 200 , 30);
           add(card);
           
           JLabel number  = new JLabel ("XXXX-XXXX-XXXX-2507 ");
       number.setFont(new Font("Raleway", Font.BOLD , 22));
           number.setBounds(330 , 300 , 300 , 30);
           add(number);
           
           JLabel carddetail  = new JLabel ("Your 16 Digit Card Number");
       carddetail.setFont(new Font("Raleway", Font.BOLD , 12));
           carddetail.setBounds(100 , 330 , 300 , 20);
           add(carddetail);
           
           JLabel pin  = new JLabel ("PIN :");
       pin.setFont(new Font("Raleway", Font.BOLD , 22));
           pin.setBounds(100 , 370 , 200 , 30);
           add(pin);
 
             JLabel pnumber  = new JLabel ("XXXX ");
       pnumber.setFont(new Font("Raleway", Font.BOLD , 22));
           pnumber.setBounds(330 , 370 , 300 , 30);
           add(pnumber);
           
           JLabel pdetail  = new JLabel ("Your 4 Digit Password ");
       pdetail.setFont(new Font("Raleway", Font.BOLD , 12));
           pdetail.setBounds(100 , 400 , 300 , 20);
           add(pdetail);
           
           JLabel services  = new JLabel ("Services Required :");
       services.setFont(new Font("Raleway", Font.BOLD , 22));
           services.setBounds(100 , 450 , 300 ,30);
           add(services);
           
           c1 = new JCheckBox("ATM CARD");
           c1.setBackground(Color.WHITE);
           c1.setFont(new Font("Raleways",Font.BOLD , 16));
           c1.setBounds(100 , 500 , 150  , 30);
           add(c1);
           
           c2 = new JCheckBox("INTERNET BANKING");
           c2.setBackground(Color.WHITE);
           c2.setFont(new Font("Raleways",Font.BOLD , 16));
           c2.setBounds(400 , 500 , 300  , 30);
           add(c2);
           
           c3 = new JCheckBox("MOBILE BANKING");
           c3.setBackground(Color.WHITE);
           c3.setFont(new Font("Raleways",Font.BOLD , 16));
           c3.setBounds(100 , 550 , 300  , 30);
           add(c3);
           
           c4 = new JCheckBox("EMAIL & SMS ALERT");
           c4.setBackground(Color.WHITE);
           c4.setFont(new Font("Raleways",Font.BOLD , 16));
           c4.setBounds(400 , 550 , 300  , 30);
           add(c4);
           
           
           c5 = new JCheckBox("CHEQUE BOOK");
           c5.setBackground(Color.WHITE);
           c5.setFont(new Font("Raleways",Font.BOLD , 16));
           c5.setBounds(100 , 600 , 200  , 30);
           add(c5);
           
           
           c6 = new JCheckBox("E-STATEMENT");
           c6.setBackground(Color.WHITE);
           c6.setFont(new Font("Raleways",Font.BOLD , 16));
           c6.setBounds(400 , 600 , 150  , 30);
           add(c6);
           
           c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge. ");
           c7.setBackground(Color.WHITE);
           c7.setFont(new Font("Raleways",Font.BOLD , 12));
           c7.setBounds(100 , 680 , 600  , 20);
           add(c7);
           
           submit = new JButton("SUBMIT");
           submit.setFont(new Font("Raleways", Font.BOLD , 15));
           submit.setForeground(Color.WHITE);
           submit.setBackground(Color.BLACK);
           submit.setBounds(100  , 710 , 100 , 30);
           submit.addActionListener(this);
           add(submit);
           
            cencle = new JButton("CENCEL");
           cencle.setFont(new Font("Raleways", Font.BOLD , 15));
           cencle.setForeground(Color.WHITE);
           cencle.setBackground(Color.BLACK);
           cencle.setBounds(600  , 710 , 100 , 30);
           cencle.addActionListener(this);
           add(cencle);
           
  setSize(850,820);
  setLocation(350,0);
  getContentPane().setBackground(Color.white);
  setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    
       if(ae.getSource() == submit){
       
           String accountType = null;
           if(r1.isSelected()){
           accountType = "Saving Account ";
           }
           else if(r2.isSelected()){
           accountType = "Fixed Deposite Account";
           }
           else if(r3.isSelected()){
           accountType = "Current Account";
           }
           else if(r4.isSelected()){
           accountType = "Recurring Deposit Account";
           }
           Random random = new Random();
           String cardnumber = ""+Math.abs((random.nextLong() % 9000000L) + 5040936000000000L);
           String pinnumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L);
           String facility = "";
           if(c1.isSelected()){
           facility = facility + " ATM Card";
           }else if(c2.isSelected()){
           facility = facility + " Internet Banking";
           }else if(c3.isSelected()){
           facility = facility + " Mobile Banking";
           }else if(c4.isSelected()){
           facility = facility + " Email & SMS Book";
           }else if(c5.isSelected()){
           facility = facility + " Cheque Book";
           }else if(c6.isSelected()){
           facility = facility + " E-Statement";
           }

         try{
           
             if(accountType.equals("")){
        JOptionPane.showMessageDialog(null,"accountType is Required ");
    }
//          if(de.equals("")){
//        JOptionPane.showMessageDialog(null,"name is Required ");
//    }
             else{
             Conn conn = new Conn();
             String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
              String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
             conn.s.executeUpdate(query1);
                          conn.s.executeUpdate(query2);
             
             JOptionPane.showMessageDialog(null, "card number: "+ cardnumber +"\n Pin : "+ pinnumber);
             
             setVisible(false);
             new Diposit(pinnumber).setVisible(true);
             }
            
           }catch(Exception e){
           System.out.println(e);
           }
           
       }else if(ae.getSource()== cencle){
       setVisible(false);
       new Login().setVisible(true);
           
       }
    }
    
public static void main(String args[]){
new signupThree(""); 
}   
}
