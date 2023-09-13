
package com.schooljorgina.apischool.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CreateAccount {

    private Long ra;
    @NotBlank(message = "o nome é obrigatorio")
    private String nome;

    private String email;

    private String senha;

}