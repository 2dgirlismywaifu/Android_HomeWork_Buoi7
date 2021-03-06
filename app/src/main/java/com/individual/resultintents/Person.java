package com.individual.resultintents;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Person implements Serializable {


    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }

}