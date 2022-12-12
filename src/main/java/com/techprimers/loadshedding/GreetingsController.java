package com.techprimers.loadshedding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public String greetings() throws InterruptedException {
        Thread.sleep(60000);
        return "Hello Youtube";
    }

}
