package com.gameshop.api.carts.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("API-USERS")
public interface UserClient {

    @GetMapping("/user/logged")
    String getUser();

}
