package br.com.meli.praticaIntegradora1.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
public class StudentDto implements Serializable {

    @NotEmpty(message = "O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "[A-Z]\\D*", message = "O nome do aluno deve começar com letra maiúscula.")
    @Size(max = 50, message = " O comprimento do nome do aluno não pode exceder 50 caracteres.")
    private String studentName;

    @NotEmpty(message = "lista nao pode ser vazia ")
    @Valid
    private List<SubjectDto> subjects;


}
