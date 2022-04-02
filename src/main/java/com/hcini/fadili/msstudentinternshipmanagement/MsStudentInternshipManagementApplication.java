package com.hcini.fadili.msstudentinternshipmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class MsStudentInternshipManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsStudentInternshipManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner start() {

        return args -> System.out.println("hello friends");
    }

}
