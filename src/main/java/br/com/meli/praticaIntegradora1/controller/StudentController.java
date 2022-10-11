package br.com.meli.praticaIntegradora1.controller;

import br.com.meli.praticaIntegradora1.dto.ResponseDto;
import br.com.meli.praticaIntegradora1.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/verifica-nota")
public class StudentController {
    @PostMapping
    public ResponseEntity<Object> verificarNota(@RequestBody @Valid StudentDto studentDto){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStudentName(studentDto.getStudentName());
        responseDto.setSubjects(studentDto.getSubjects());
        responseDto.setupResposta();
        return ResponseEntity.ok(responseDto);
    }

}
