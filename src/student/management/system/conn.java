package student.management.system;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class conn {
   Connection connection;
   Statement statement;

   public  conn(){
    try {
        // Loading the PostgreSQL JDBC Driver where Class.forName is used to load the driver class dynamically at runtime and register it with DriverManager
Class.forName("org.postgresql.Driver");
        // Establishing the connection to the database
        connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee_Management_DB","postgres","SiddharthPostgres@123");
        // Statement is used to execute the sql queries, here we are creating the statement object for executing queries
        statement=connection.createStatement();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
   }


}
