package com.example.students.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student masake = new Student("Masake", LocalDate.of(1999, APRIL,3),"masake@gmail.com");
            Student caleb = new Student("caleb", LocalDate.of(1999, Month.APRIL,3),"caleb@gmail.com");

            studentRepository.saveAll(List.of(masake,caleb));
        };
    }
}
