package com.spring.web.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.spring.web.model.User;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.ANY)
@Getter
@Setter
public class UserRegistrationDTO extends User {

    private Long id;

    private String nome;
    private String email;
    private String senha;

    public UserRegistrationDTO() {}

    public UserRegistrationDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public User toUser() {
        return new User(getNome(), getEmail(), getSenha());
    }
}
