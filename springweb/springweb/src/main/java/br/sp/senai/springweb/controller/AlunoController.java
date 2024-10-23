package br.sp.senai.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.sp.senai.springweb.model.Aluno;
import br.sp.senai.springweb.repository.AlunoRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	@Autowired
	AlunoRepository alunoRep;
	
	@GetMapping("/cadastro")
	public String nome() {
		return "/aluno/alunofrm";
	}

	
	@PostMapping("/gravar")
	public String gravar(Aluno aluno) {
		
		alunoRep.save(aluno);
		
		return "home"; //Chama o home.html
	}
}
