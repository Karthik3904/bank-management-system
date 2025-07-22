
package bank.management.sytem;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
             // Class.forName(com.mysql.cj.jdbc.Driver);     Register Driver Automatically get from library
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root");
            s = c.createStatement();                     //Create Statement
                    
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
