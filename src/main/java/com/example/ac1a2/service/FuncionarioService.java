package com.example.ac1a2.service;

import com.example.ac1a2.repository.FuncionarioRepository;

import java.util.List;

import com.example.ac1a2.entidade.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository fp;

    public List<Funcionario> getFuncionario()
    {
        return fp.findAll();
    }

    public void addFuncionario(Funcionario f)
    {
        if((f.getId() == 0) || (f.getNome().equals(null)) || (f.getIdade() == 0) || (f.getCPF().equals(null)) || (f.getSalario() == 0))
            fp.save(f);
        else
            fp.save(f);
    }
    
}