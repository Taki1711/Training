package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

    /*
    1) Creazione DATABASE mySQL comprensiva di collegamento ad IDE e all'applicazione DemoApplication.

    2) Creazione tabella Persona con attributi(nome, cognome, eta, cellulare, email).

     */




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
