package com.study.deploy_back.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${client.address}")
    private String clientAddress;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok().body(clientAddress + "테스트!! 김동인");
    }
}
