package com.example.CsudhPlanner.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;



public class Person {

    private final int id;

    @NonNull
    private final String name;
    private final String email;

    public Person(@JsonProperty("id") int id,
                  @NonNull @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
        this.email = "test@csudh.edu";
    }


    public int getId(){
        return this.id;
    }

    @NonNull
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
