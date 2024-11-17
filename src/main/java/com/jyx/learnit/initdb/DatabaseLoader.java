package com.jyx.learnit.initdb;


import com.jyx.learnit.repository.AccountRepository;
import com.jyx.learnit.repository.CourseRepository;
import com.jyx.learnit.repository.MaterialRepository;
import com.jyx.learnit.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseLoader {


    @Bean
    CommandLineRunner initDatabase(
            AccountRepository accountRepository,
            CourseRepository courseRepository,
            MaterialRepository materialRepository,
            StudentRepository studentRepository
    ) {

        return args -> {
            // fill database

        };
    }


}