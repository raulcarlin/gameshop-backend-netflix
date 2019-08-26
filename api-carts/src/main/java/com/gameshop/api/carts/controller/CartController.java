package com.gameshop.api.carts.controller;

import com.gameshop.api.carts.client.UserClient;
import com.gameshop.api.carts.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("cart/{user}")
    public String getCartFor(@PathVariable("user") String user) { return cartService.getItensInCart(user); }

}
