package com.gestao.pessoas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pessoas")
public class PessoaController {

    @PostMapping
    public ResponseEntity<?> salvarPessoas(){

        return ResponseEntity.ok("OK");
    }
}
