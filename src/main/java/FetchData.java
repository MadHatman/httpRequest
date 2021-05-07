import DTO.Response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;


public class FetchData {
    public Response fetchData(String year, String month, String day) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(
                URI.create("http://www.dsdev.tech/logs/" + year + month + day))
                .header("accept", "application/json")
                .build();

        var response = client.send(request, new CustomBodyHandler<>(Response.class));

/*        for (Logs item: response.body().get().logs) {
            System.out.println(item.first_name);
        }*/
        return response.body().get();
    }
}
