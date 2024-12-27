package com.ocean.springbootstart;

import com.ocean.springbootstart.listeners.User;
import com.ocean.springbootstart.listeners.UserRegisteredEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index/")
public class IndexController {
    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping(value = "publishEvent/{name}")
    public String  publishEvent(@Validated @PathVariable(name = "name") String name){
        UserRegisteredEvent userRegisteredEvent = new UserRegisteredEvent(this, new User(name));
        publisher.publishEvent(userRegisteredEvent);
        return "xxxx";
    }


    @PostMapping("validata")
    public ResponseEntity<String> validateParams(@Validated @RequestBody User user){
        return ResponseEntity.ok(null);
    }
}
