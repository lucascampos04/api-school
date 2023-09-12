
package com.schooljorgina.apischool.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CreateAccount {

    private Long ra;

    private String nome;

    private String email;

    private String senha;

    private LocalDateTime dataLogin;
}
