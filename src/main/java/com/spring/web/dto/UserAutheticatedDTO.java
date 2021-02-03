package com.spring.web.dto;


import com.spring.web.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserAutheticatedDTO {
    private String tipo;
    private String email;
    private String nome;
    private String token;

    public UserAutheticatedDTO(String email, String nome, String token, String tipo) {
        this.email = email;
        this.nome = nome;
        this.token = token;
        this.tipo = tipo;
    }

    public static UserAutheticatedDTO toDTO(User user, String tipo) {
        return new UserAutheticatedDTO(user.getEmail(), user.getNome(), user.getToken(), tipo);
    }
}