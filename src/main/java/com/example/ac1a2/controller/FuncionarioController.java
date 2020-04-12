package com.example.ac1a2.controller;

import com.example.ac1a2.entidade.Funcionario;
import com.example.ac1a2.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService fs;

    @GetMapping("/")
    public ModelAndView getFuncionarioMV()
    {
        ModelAndView mv = new ModelAndView("FuncionarioView");
        mv.addObject("funcionarios", fs.getFuncionario());
        return mv;
    }

    @PostMapping("/")
    public ModelAndView saveFuncionarioMV(@ModelAttribute Funcionario funcionario)
    {
        ModelAndView mv = new ModelAndView("FuncionarioView");
        fs.addFuncionario(funcionario);
        mv.addObject("funcionarios", fs.getFuncionario());
        return mv;
    }


}