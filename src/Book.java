import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Book {
    String bookName;

    public void DataBaseConnection(){
        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/endterm","root","390422");
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("SELECT id, bookName,jenre, price FROM `endterm`.`flip`");
            System.out.println(rs);
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String genre = rs.getString(3);
                int price = rs.getInt(4);
                System.out.println(id + " | " + name + " | " + genre + " | " + price); //ДЛЯ ВИДА
            }
            rs.close();


        } catch(Exception e)  {
            e.printStackTrace();
        }
    }
}
