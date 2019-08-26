package com.gameshop.authproxy.config;

import com.gameshop.authproxy.domain.User;
import com.gameshop.authproxy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PostStartup implements CommandLineRunner {

    @Autowired
    UserRepository userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        userRepo.save(User.builder()
                .username("admin")
                .password(this.passwordEncoder.encode("admin"))
                .roles(Arrays.asList( "ROLE_ADMIN"))
                .build()
        );

        userRepo.save(User.builder()
                .username("user")
                .password(this.passwordEncoder.encode("user"))
                .roles(Arrays.asList( "ROLE_USER"))
                .build()
        );
    }
}
