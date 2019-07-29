package com.yzhang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class ActivitiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActivitiDemoApplication.class, args);
    }
}