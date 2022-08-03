package com.example.testspring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                    Student Yamika = new Student(

                            "yamikaaaa",
                            LocalDate.of(1997, Month.JULY,17),
                            "aymp@gmail.com"

                    );
                    Student perera = new Student(

                            "yamika",
                            LocalDate.of(1995, Month.JULY,17),
                            "aym@gmail.com"

                    );
                    repository.saveAll(
                            List.of(Yamika,perera)
                    );
        };
    }
}
