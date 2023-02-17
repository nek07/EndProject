import java.sql.*;
import java.util.Scanner;

public class Login {
    Scanner scan=new Scanner(System.in);
    public void Login(String account,String password) throws SQLException {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/endterm", "root", "390422");
            Statement statement = connection.createStatement();
            ResultSet rsLog = statement.executeQuery("SELECT id, login,password FROM `endterm`.`account`");
            //с этого места все начинается
            while (rsLog.next()) {
                int id = rsLog.getInt(1); //айди
                String cAccount = rsLog.getString(2); //Достает из базы данных вторая колонна Аккаунт
                String cPassword = rsLog.getString(3); //Достает из базы данных третья колонна Пароль
                if (account.equals(cAccount)) {
                    if (account.equals(cAccount) && password.equals(cPassword)) {
                        System.out.println("ВХОД ВЫПОЛНЯЕТСЯ");
                        //форма должна как то подтведить,перейти на другую пустую форму,либо выдать че то
                    } else if (account.equals(cAccount) && !password.equals(cPassword)) {
                        System.out.println("НЕВЕРНЫЙ ПАРОЛЬ"); //Пока что одна попытка вводка
                        //ливает с формы чет такое


                    } else {
                        System.out.println("ТАКОГО АККАУНТА НЕ СУЩЕСТВУЕТ");
                        //как то дает это понять
                    }
                }

            }rsLog.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}