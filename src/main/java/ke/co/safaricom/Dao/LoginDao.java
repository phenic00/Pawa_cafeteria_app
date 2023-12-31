package ke.co.safaricom.Dao;

import ke.co.safaricom.config.DatabaseConfig;
import ke.co.safaricom.dto.LoginOption;
import ke.co.safaricom.model.Login;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class LoginDao {
    private static final Sql2o sql2o = DatabaseConfig.getDatabase();

    public static void create(Login login) {
        try (Connection connection = sql2o.open()) {
            String query = "INSERT INTO users (name, email,password) VALUES (:name, :email :password,:typeofuser);";
            connection.createQuery( query )
                    .addParameter( "name", login.getName() )
                    .addParameter( "email", login.getEmail() )
                    .addParameter( "typeofuser", login.getTyperOfUser() )
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println( exception.getMessage() );
        }
    }

    public static List<LoginOption> findLoginIdById(String email){

        try(Connection connection =  sql2o.open()){
            String query = "SELECT *  FROM users WHERE  email ='"+ email+"';";
            return connection.createQuery(query).executeAndFetch( LoginOption.class );

        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }

    }


}
