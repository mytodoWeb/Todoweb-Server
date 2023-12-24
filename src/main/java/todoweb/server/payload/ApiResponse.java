package todoweb.server.payload;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder
public class ApiResponse {
    private final String msg;
    private final String code;

    public static ApiResponse of(String message , String code){
        return new ApiResponse(message,code);
    }
}
