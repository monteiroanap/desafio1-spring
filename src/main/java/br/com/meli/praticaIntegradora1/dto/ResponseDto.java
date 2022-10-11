package br.com.meli.praticaIntegradora1.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDto {
    private String studentName;
    private String message;
    private double averageScore;
    private List<SubjectDto> subjects;

    public void calculaMedia() {
        double soma = subjects.stream().map(s -> s.getScore()).reduce(0.0,Double::sum);
        this.averageScore = soma / subjects.size();
    }

    public void setupResposta() {
        this.calculaMedia();
        this.message = "O aluno " + this.studentName + " obteve uma média de " + this.averageScore;
    }

}
