package com.example.testspring;

import com.example.testspring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class TestSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringApplication.class, args);
    }

}
