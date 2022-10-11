package br.com.meli.praticaIntegradora1.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class SubjectDto implements Serializable {

    @NotEmpty(message = "O nome do assunto não pode ficar vazio")
    @Pattern(regexp = "[A-Z]\\D*", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome do assunto não pode exceder 30 caracteres.")
    private String name;

    //@NotEmpty(message = "A nota não pode estar vazia.")
    @DecimalMin(value = "0.00", message = "A nota mínima é 0,0..")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10,0.")
    private double score;


}
