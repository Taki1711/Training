package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name="DemoApplication")
public class DemoEntity {
        @Id
        @Column (name= "ID")
        Long id;
        @Column(name = "nome")
        String nome;
        @Column(name="cognome")
        String cognome;
        @Column(name="eta")
        Integer eta;
        @Column(name= "nTelefono")
        Long nTelefono;
        @Column(name="email")
        String email;
}
