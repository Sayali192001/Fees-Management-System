import java.sql.*;
public class feesConnection {
 public static Connection Connect()
 {
     Connection con=null;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(ClassNotFoundException cf)
        {
            
        } 
       try{
             String str="jdbc:mysql://localhost/fees";
              con=DriverManager.getConnection(str,"root","");
             
             
       }
       catch(SQLException sql){
           
       }
       return(con);
 }
}
