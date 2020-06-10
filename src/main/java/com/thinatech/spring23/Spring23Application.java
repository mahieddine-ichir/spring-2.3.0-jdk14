package com.thinatech.spring23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashSet;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Spring23Application {

    public Spring23Application(MyService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Spring23Application.class, args);
    }

    private final MyService myService;

    @GetMapping
    public Collection<MyRecord> hello(@RequestParam(defaultValue = "none") Type gender) {
        return new HashSet<>(myService.list(gender));
    }
}
