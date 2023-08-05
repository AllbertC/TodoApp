
package util;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Albert
 */
public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp2";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    public static Connection getConnection(){

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão com o BD", e);
        }
        }
    
    public  static void closeConnection(Connection connection){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro no fechamento de conexão com o BD", e);  
        }
    }

}
