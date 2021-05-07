import DTO.Response;
import SQL.PersistData;

public class App {
    public static void main(String[] args) throws Exception {
        String year = "2021", month = "01", day = "23";
        FetchData request = new FetchData();
        PersistData sql = new PersistData();
        Response response = request.fetchData(year, month, day);
        sql.PersistData(response);
    }
}
