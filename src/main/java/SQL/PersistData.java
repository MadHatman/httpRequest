package SQL;

import DTO.Logs;
import DTO.Response;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;

public class PersistData {
    private final String db = "jdbc:postgresql://localhost:5432/postgres";
    private final String login= "postgres";
    private final String pass = "root";
    private final String query = "INSERT INTO test.log(user_id, first_name, second_name, message, created_at ) VALUES (?, ?, ?, ?, ?)";
    public void PersistData(Response response) throws SQLException {
        Connection connect = null;
        connect = DriverManager.getConnection(db, login, pass);
        Response.logs.sort(Comparator.comparing(Logs::returnCreated));
        for (Logs item: response.logs) {
            try {
                PreparedStatement prepState = connect.prepareStatement(query);
                prepState.setInt(1, item.user_id);
                prepState.setString(2, item.first_name);
                prepState.setString(3, item.second_name);
                prepState.setString(4, item.message);
                prepState.setString(5, item.created_at);
                prepState.executeUpdate();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }
    }

}
