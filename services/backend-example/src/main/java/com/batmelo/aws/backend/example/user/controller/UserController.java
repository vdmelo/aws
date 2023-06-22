package com.batmelo.aws.backend.example.user.controller;

import com.batmelo.aws.backend.example.user.domain.User;
import com.batmelo.aws.backend.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("listar")
    public ResponseEntity<List<User>> listar() {
        return userService
                .listar()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity
                        .internalServerError()
                        .build()
                );
    }
}
