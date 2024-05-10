package com.example.metaphotogram.web;

import org.springframework.web.bind.annotation.*;


@RestController

public class HttpController {
    @GetMapping("/get")
    public String get() {
        return "<h1>get요청됨</h1>";
    }

    @PostMapping("/post")
    public String post() {
        return "post요청됨";
    }

    @PutMapping("/put")
    public String put() {
        return "p요청됨";

    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete요청됨";
    }
}
