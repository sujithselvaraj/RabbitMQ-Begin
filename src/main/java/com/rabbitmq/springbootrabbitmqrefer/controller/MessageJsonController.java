package com.rabbitmq.springbootrabbitmqrefer.controller;

import com.rabbitmq.springbootrabbitmqrefer.dto.User;
import com.rabbitmq.springbootrabbitmqrefer.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController
{
    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer)
    {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user)
    {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("json message sent to RabbitMQ...");
    }
}
