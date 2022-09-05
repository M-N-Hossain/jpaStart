package com.example.jpastart.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate born;
    private LocalDate bornTime;
    @Column(length = 250)
    private String name;

    //Getters
    public int getId() {
        return id;
    }
    public LocalDate getBorn() {
        return born;
    }
    public String getName() {
        return name;
    }

    public LocalDate getBornTime() {
        return bornTime;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBornTime(LocalDate bornTime) {
        this.bornTime = bornTime;
    }
}
