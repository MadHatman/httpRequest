package DTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Response {
    public String error;
    public static ArrayList<Logs> logs;

    public Response(@JsonProperty("error") String error,
                    @JsonProperty("logs") ArrayList<Logs> logs
            ) {
        this.error = error;
        this.logs = logs;
    }
}
