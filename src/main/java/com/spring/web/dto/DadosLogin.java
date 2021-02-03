package com.spring.web.dto;

import com.spring.web.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosLogin {

    private String email;
    private String senha;

    public DadosLogin() {}

    public DadosLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
