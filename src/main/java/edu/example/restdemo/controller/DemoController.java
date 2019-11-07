package edu.example.restdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/something/{id}")
    public ResponseEntity doSomething(@PathVariable("id") Integer id) {
        return  ResponseEntity.ok(new Message("EDDY: Do I look like a man with a plan?",2));

    }

    @PostMapping("/something")
    public ResponseEntity postSomething(@RequestBody Message message) {
        System.out.println(message.toString());
        return ResponseEntity.ok().build();
    }

    @PostMapping ("/something/{message}")
    public ResponseEntity doSomething2(@PathVariable("message") String newMessage) {

        return  ResponseEntity.ok(new Message(newMessage,2));

        //return  ResponseEntity.ok(new Message("EDDY: Do I look like a man with a plan?",2));
    }



}
