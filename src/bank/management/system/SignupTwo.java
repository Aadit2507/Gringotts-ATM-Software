package bank.management.system;
//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    

    JTextField PannumberTextField , AadharNumberTextField ;
    JButton next;
    JRadioButton Ysenior , Nsenior , YexistingAccount , NExistingAccount ;
    JComboBox religion, category ,income ,qualification ,occupation ;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2 ");
        setLayout(null);
        
        JLabel AdditionalDetails = new JLabel("page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        AdditionalDetails.setBounds(290 ,60 , 400 , 30);
        add(AdditionalDetails);
        
        JLabel Religion  =  new JLabel("Religion :");
        Religion .setFont(new Font("Raleway",Font.BOLD, 20));
        Religion .setBounds(100 ,140 , 100 , 30);
        add(Religion );
        
        String valreligion[] ={"Hindu", "Muslim" ,"Sikh" ,"Chirstian", "Other"};
        
         religion = new JComboBox(valreligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
         add(religion);
        
        JLabel Category =  new JLabel("Category :");
        Category.setFont(new Font("Raleway",Font.BOLD, 20));
        Category.setBounds(100 ,190 , 200 , 30);
        add(Category);
        
        String valcategory[] = {"Genral", "OBC" , "ST" , "SC" , "OTHER"};
        
        category =  new JComboBox(valcategory);
        category.setBounds(300 , 190 , 400 , 30);
          category.setBackground(Color.WHITE);
        add(category);
        
        JLabel Income =  new JLabel("Income :");
        Income.setFont(new Font("Raleway",Font.BOLD, 20));
        Income.setBounds(100 ,240 , 200 , 30);
        add(Income);
        String valincome[] = {"NULL", "< 1,50,000" , "<2,50,000" ,"< 5,00,000", "Upto 10,00,000"};
         income = new JComboBox(valincome);
        
        income.setBounds(300 , 240 , 400 ,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel EducationQualification =  new JLabel("Education");
        EducationQualification.setFont(new Font("Raleway",Font.BOLD, 20));
        EducationQualification.setBounds(100 ,300 , 200 , 30);
        add(EducationQualification);
               
       
        JLabel Qualification =  new JLabel("Qualification :");
        Qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        Qualification.setBounds(100 ,330 , 200 , 30);
        add(Qualification);
        
        String valqualification[] = {"Non-Graduate", "Gradute", "Post-Gradute", "Doctrate","other"};
         qualification = new JComboBox(valqualification);
         
        qualification.setBounds(300 , 320 , 400 , 30);
        add(qualification);
        
        JLabel Occupaton =  new JLabel("Occupaton:");
        Occupaton.setFont(new Font("Raleway",Font.BOLD, 20));
        Occupaton.setBounds(100 ,390 , 200 , 30);
        add(Occupaton);
       String valoccupation[] = {"Salaried","Self-Employed" , "Bussiness","Student","Retired","Other"};
         occupation = new JComboBox(valoccupation);
        occupation.setBounds(300 ,390 , 400 , 30);
        add(occupation);
        
        JLabel Pannumber =  new JLabel("PAN Number :");
        Pannumber.setFont(new Font("Raleway",Font.BOLD, 20));
        Pannumber.setBounds(100 ,440 , 400 , 30);
        add(Pannumber);  
        
         PannumberTextField = new JTextField();
        PannumberTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        PannumberTextField.setBounds(300 , 440 , 400 , 30);
        add(PannumberTextField);
        
        JLabel AadharNumber =  new JLabel("Aadhar Number :");
        AadharNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        AadharNumber.setBounds(100 ,490 , 200 , 30);
        add(AadharNumber);  
        
         AadharNumberTextField = new JTextField();
        AadharNumberTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        AadharNumberTextField.setBounds(300 , 490 , 400 , 30);
        add(AadharNumberTextField);
        
        JLabel Seniorcitizen =  new JLabel("Senior Citizen :");
        Seniorcitizen.setFont(new Font("Raleway",Font.BOLD, 20));
        Seniorcitizen.setBounds(100 ,540 , 200 , 30);
        add(Seniorcitizen);  
        
        Ysenior = new JRadioButton("Yes");
        Ysenior.setBounds(300 ,540 , 50 , 30);
        Ysenior.setBackground(Color.WHITE);
        add(Ysenior);
        
        Nsenior = new JRadioButton("No");
        Nsenior.setBounds(450 ,540 , 50 , 30);
        Nsenior.setBackground(Color.WHITE);
        add(Nsenior);
        
        ButtonGroup SeniorcitizenGroup = new ButtonGroup();
        SeniorcitizenGroup.add(Ysenior);
                SeniorcitizenGroup.add(Nsenior);

         
        
        JLabel ExistingAccount =  new JLabel("Existing Account :");
        ExistingAccount.setFont(new Font("Raleway",Font.BOLD, 20));
        ExistingAccount.setBounds(100 ,590 , 200 , 30);
        add(ExistingAccount);  
        
        YexistingAccount = new JRadioButton("Yes");
        YexistingAccount.setBounds(300 ,590 , 50 , 30);
        YexistingAccount.setBackground(Color.WHITE);
        add(YexistingAccount);
        
        NExistingAccount = new JRadioButton("No");
        NExistingAccount.setBounds(450 ,590 , 50 , 30);
        NExistingAccount.setBackground(Color.WHITE);
        add(NExistingAccount);
        
        ButtonGroup ExistingAccountGroup = new ButtonGroup();
        ExistingAccountGroup.add(YexistingAccount);
                ExistingAccountGroup.add(NExistingAccount);
         
        
         next = new JButton("Next");
        next.setBounds(620 , 660 , 80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//    String formno = "" + random;
    String srelegion =(String) religion.getSelectedItem();
    String scategory  = (String)category.getSelectedItem();
    String sincome = (String)income.getSelectedItem();
    String seducation = (String)qualification.getSelectedItem();
    String soccupation = (String)occupation.getSelectedItem();
    String seniorcitizen = null;
    if (Ysenior.isSelected()){
    seniorcitizen = "yes";
}
    else if(Nsenior.isSelected()){
                    seniorcitizen = "no";
                    }
    String span = PannumberTextField.getText();
    String sadhar = AadharNumberTextField.getText();
    String sexisting = null;
    if(YexistingAccount.isSelected()){
 sexisting = "yes";
 }
    else if(NExistingAccount.isSelected()){
    sexisting = "no";
    }
    
    try{
    Conn c = new Conn();
    String query = "insert into singuptwo values('"+formno+"','"+srelegion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+span+"','"+sadhar+"','"+sexisting+"')";
    c.s.executeUpdate(query);
    
    setVisible(false);
    new signupThree(formno).setVisible(true);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    
public static void main(String args[]){
new SignupTwo("");
}    
}
