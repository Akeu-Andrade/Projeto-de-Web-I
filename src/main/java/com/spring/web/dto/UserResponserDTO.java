package com.spring.web.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.spring.web.model.User;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.ANY)
@Getter
@Setter
public class UserResponserDTO {

    private Long id;

    private String nome;
    private String email;
    private String senha;

    public UserResponserDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public UserResponserDTO() {
    }

    public static UserResponserDTO toDTO(User user) {
        return new UserResponserDTO(user.getNome(), user.getEmail(), user.getSenha());
    }
}
