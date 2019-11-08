package edu.example.restdemo.controller;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Column(name = "message")
    private String message;

    @Id
    @GeneratedValue
    private Integer id;

    public Message(String message, Integer id) {
        this.message = message;
        this.id = id;
    }

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

}
