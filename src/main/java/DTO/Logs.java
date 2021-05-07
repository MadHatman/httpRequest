package DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Logs {
    public String created_at;
    public String first_name;
    public String message;
    public String second_name;
    public Integer user_id;

    public Logs(@JsonProperty("created_at") String created_at,
                @JsonProperty("first_name") String first_name,
                @JsonProperty("message") String message,
                @JsonProperty("second_name") String second_name,
                @JsonProperty("user_id") Integer user_id
    ) {
        this.created_at = created_at;
        this.first_name = first_name;
        this.message = message;
        this.second_name = second_name;
        this.user_id = user_id;
    }

    public String returnCreated() {
        return this.created_at;
    }
}
