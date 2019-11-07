package edu.example.restdemo.controller;


import javax.persistence.*;

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

    public Integer getId() {
        return id;
    }

    public Message setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

}
