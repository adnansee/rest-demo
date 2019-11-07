package edu.example.restdemo.controller;


import edu.example.restdemo.config.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageRepository mrep;


    @GetMapping()
    public List<Message> giveMsg(){
       return mrep.findAll();

    }

    @PostMapping
    public void enterMsg(@RequestBody Message message){
        mrep.save(message);
    }

    @DeleteMapping("/{id}")
    public void delMsg(@PathVariable ("id") Integer integer){
        mrep.deleteById(integer);

    }

    @GetMapping("/{id}")
    public Message giveOneMessage (@PathVariable ("id") Integer integer){
        return mrep.findById(integer).get();
           }




}
