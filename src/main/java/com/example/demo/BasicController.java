package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/hello")
public class BasicController {

    @GetMapping()
    public ResponseEntity<GetResponse> helloWorld() {
        GetResponse getResponse = GetResponse.builder().message("Hello World!").build();
        return new ResponseEntity<>(getResponse, HttpStatus.OK);
    }
}
