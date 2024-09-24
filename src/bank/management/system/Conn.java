
package bank.management.system;
import java.sql.*;
public class Conn {

      Connection c;
    Statement s;
    
public Conn(){

  
try {
   // Class.forname(com.mysql.cj.jdbc.Driver); no need to ragister driver bcoz now java can autom. find the driver from libraries pathway
    c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","a2mysql");
    s = c.createStatement();
}

catch (Exception e){
    System.out.println(e);
}
}
    
}
