
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class databaseConnection {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL ="jdbc:mysql://localhost/student";
    
    final static String  USER = "root";
    final static String  PASS ="";
    
    
    static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    
                    return conn;
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(databaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}