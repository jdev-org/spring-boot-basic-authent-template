package com.aut.basic.template.basic_authent_template.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, authenticated user!";
    }

    @PostMapping(value = "/foo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> foo() {
        return ResponseEntity.status(HttpStatus.OK).body("{code : success}");
    }
    
}