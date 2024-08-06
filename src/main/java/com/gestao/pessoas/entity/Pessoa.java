package com.gestao.pessoas.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "pessoa",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Endereco> enderecos;

}
