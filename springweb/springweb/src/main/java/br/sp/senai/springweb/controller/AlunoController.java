package br.sp.senai.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.sp.senai.springweb.model.Aluno;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@GetMapping("/cadastro")
	public String nome() {
		return "/aluno/alunofrm";
	}

	
	@PostMapping("/gravar")
	public String gravar(Aluno aluno) {
		
		return "home"; //Chama o home.html
	}
}
