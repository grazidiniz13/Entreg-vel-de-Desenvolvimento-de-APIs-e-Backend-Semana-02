package com.exemplo.projetoaluno.controller;

import com.exemplo.projetoaluno.model.Aluno;
import com.exemplo.projetoaluno.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // --- RESOLUÇÃO DO DESAFIO PRÁTICO ---
    @GetMapping("/desafio")
    public String meuRa() {
        // Coloque aqui o seu nome e o seu RA entre aspas
        String nome = "Grazielli Diniz Arouche";
        String ra = "101736";

        return "O RA do aluno " + nome + " é " + ra;
    }

    // Endpoint para listar os alunos salvos no banco
    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    // Endpoint para cadastrar um novo aluno via POST
    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }
}