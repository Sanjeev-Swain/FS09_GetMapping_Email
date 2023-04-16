package com.example.FS09_GetMapping_Email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration
{
    @Bean
    public Student getStudent()
    {
        return new Student("Sanjeev");
    }

}
