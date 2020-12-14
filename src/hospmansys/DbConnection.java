package hospmansys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection {
  public static Connection connect() throws SQLException{
      Connection con=null;
      try{
          Class.forName("org.sqlite.JDBC");
          DriverManager.getConnection("jdbc:sqlite:PDdb.db");
          System.out.println("Connected!");
      }
      catch(ClassNotFoundException | SQLException e){
          System.out.println(e+"");
      }
      return con;
    }
}
 

