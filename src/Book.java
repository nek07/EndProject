import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Book {
    String bookName;
    int aitushniki;
    String JKBHIB;
    int adg;
    int a;
    public void DataBaseConnection(){
        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/endterm","root","390422");
            Statement statement=connection.createStatement();


        } catch(Exception e)  {
            e.printStackTrace();
        }
    }
}
