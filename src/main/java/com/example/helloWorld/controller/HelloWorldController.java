package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/helloWorld")
  String helloWorld() {
    return "Hello World!";
  }

}
