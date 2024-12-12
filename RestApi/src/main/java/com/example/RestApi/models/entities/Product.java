package com.example.RestApi.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nim;  

    public Product() {}

    public Product(String name, String nim) { 
        this.name = name;
        this.nim = nim;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {  // Getter method for nim
        return nim;
    }

    public void setNim(String nim) {  // Setter method for nim
        this.nim = nim;
    }
}
