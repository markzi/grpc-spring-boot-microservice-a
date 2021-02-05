package com.example.grpcmicroservicea;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingSupplierService greetingSupplierService;

    public GreetingService(GreetingSupplierService greetingSupplierService) {
        this.greetingSupplierService = greetingSupplierService;
    }

    public String getGreeting(String name) {
        return greetingSupplierService.greeting.apply(name);
    }
}
