package br.com.meli.praticaIntegradora1;

import br.com.meli.praticaIntegradora1.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/verifica-nota")
public class controller {
    @PostMapping
    public ResponseEntity<Object> verificarNota(@RequestBody @Valid StudentDto studentDto){

        return null;
    }

}
