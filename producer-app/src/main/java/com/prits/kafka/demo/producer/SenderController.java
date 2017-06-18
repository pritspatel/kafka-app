package com.prits.kafka.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by priteshpatel on 6/18/17.
 */
@RestController
public class SenderController {


    @Autowired
    private Sender sender;

    @RequestMapping(name = "/send")
    public void send(){

        for(int i=0; i< 1000; i++) {
            System.out.println("Sending messages....");
            sender.send("helloworld.t", "Message :" + i);
        }
    }
}
