package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Integer id;
    private String name;
    private String email;
    public int getId() {
        return id;
    }
}




public class StudentEntity{
    @Id
    @GeneratedValue(strategy =)
}