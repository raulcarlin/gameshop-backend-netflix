package com.gameshop.api.carts.service;

import com.gameshop.api.carts.client.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartService {

    @Autowired
    UserClient userClient;

    Map<String, String> usersCart = new HashMap<String, String>() {{
        put("usertest", "Cart");
    }};

    @HystrixCommand(fallbackMethod="showEmptyCart")
    public String getItensInCart(String user) {
        return usersCart.get(userClient.getUser());
    }

    public String showEmptyCart(String cartId) {
        return "Oops";
    }

}
