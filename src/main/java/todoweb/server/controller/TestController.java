package todoweb.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todoweb.server.payload.ApiResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

    @GetMapping("/version")
    public ApiResponse getVersion(){
        return ApiResponse.of("Hi","200");
    }

}
