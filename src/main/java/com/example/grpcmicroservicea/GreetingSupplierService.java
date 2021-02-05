package com.example.grpcmicroservicea;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class GreetingSupplierService {

    Function<String, String> greeting = (name) -> String.format("Hello %s, am fine thanks for asking! :)", name);

}
