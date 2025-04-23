package com.hendisantika.tutorialservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(TutorialServiceApplication.class);

    public static void main(String[] args) {
        log.info("Starting TutorialServiceApplication");
        log.info("DB_URL = {}", System.getenv("DB_URL"));
        log.info("DB_USERNAME = {}", System.getenv("DB_USERNAME"));
        log.info("DB_PASSWORD = {}", System.getenv("DB_PASSWORD"));
        SpringApplication.run(TutorialServiceApplication.class, args);
    }

}
