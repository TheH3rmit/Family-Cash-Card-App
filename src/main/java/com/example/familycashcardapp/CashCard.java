package com.example.familycashcardapp;

import org.springframework.web.bind.annotation.GetMapping;

record CashCard(Long id, Double amount) {

    @GetMapping("/cashcards")
    public String helloWorld(){
        return "Hello World";
    }
}

