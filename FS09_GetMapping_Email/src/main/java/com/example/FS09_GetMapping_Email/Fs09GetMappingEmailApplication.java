package com.example.FS09_GetMapping_Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class Fs09GetMappingEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(Fs09GetMappingEmailApplication.class, args);
    }
}
