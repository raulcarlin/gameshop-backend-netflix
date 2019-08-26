package com.gameshop.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
@RequestMapping("carts")
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

    @GetMapping("user/logged")
    public String getLoggedUser() { return "usertest"; }

    @PostMapping("user/change")
    public String changeUser(@RequestBody String user) { return "test"; }

}
