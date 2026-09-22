package com.exemplo.projetoaluno.service;

import com.exemplo.projetoaluno.model.Aluno;
import com.exemplo.projetoaluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Método para listar todos os alunos do banco
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    // Método para salvar um aluno no banco
    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}