package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
    private String risposta = "Ciao";

    @RequestMapping("/index.html")
    public String index() {

        if(risposta != "NO"){
         return risposta;
        }else{
            risposta = "SI";
            return risposta;
        }


    }
}
