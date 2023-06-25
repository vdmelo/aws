package com.batmelo.aws.backend.example.user.service;

import com.batmelo.aws.backend.example.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public Optional<List<User>> listar() {
        return Optional.of(List.of(
                new User("Vinicius", "vinicius@vinicius.com"),
                new User("Samila", "samila@samila.com"),
                new User("Bernardo", "bernardo@bernardo.com"),
                new User("Novo", "novo@bernardo.com"),
                new User("Velho", "velho@bernardo.com"),
                new User("Isadora", "isadora@isadora.com")
        ));
    }
}
