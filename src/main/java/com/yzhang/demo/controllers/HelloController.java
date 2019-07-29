package com.yzhang.demo.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.RuntimeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HelloController {

    RuntimeService runtimeService;

    @RequestMapping("/")
    public String index() {
        log.info("request coming ...");
        return "Greetings from Spring Boot!";
    }
}
