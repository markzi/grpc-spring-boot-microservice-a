package com.example.grpcmicroservicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingRestController {

    private final GreetingService greetingService;

    public GreetingRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/name/{name}")
    public String getGreetingForName(@PathVariable("name") String name) {
        return greetingService.getGreeting(name);
    }

}
