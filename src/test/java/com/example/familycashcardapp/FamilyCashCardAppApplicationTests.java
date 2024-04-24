package com.example.familycashcardapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FamilyCashCardAppApplicationTests {


    @Test
    void Test() {
        assertThat(42).isEqualTo(42);
    }

}
