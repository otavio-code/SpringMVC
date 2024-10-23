package br.sp.senai.spring_escola.escola;

import java.io.File;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.sp.senai.spring_escola.escola.model.Aluno;
import br.sp.senai.spring_escola.escola.repository.AlunoRepository;

@SpringBootApplication
public class EscolaApplication implements CommandLineRunner {
	
	@Autowired
	private AlunoRepository alunoRep;

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		File arquivo = new File("C:\\temp\\alunos.txt");
		
		Scanner leitor = new Scanner(arquivo);
		
		String tmp = "";
		String[] vetor;
		Aluno atmp;
		while (leitor.hasNextLine()) {
			tmp = leitor.nextLine();
			vetor = tmp.split(";");
			atmp = new Aluno(null, vetor[0], vetor[1]);
			alunoRep.save(atmp);
			
		}
		
		leitor.close();

		//Aluno a = new Aluno(null, "Bittencourt", "000.444.888-22");
		//alunoRep.save(a);
		

		try {
			alunoRep.deleteById(6L);
			System.out.println("Excluído com sucesso");
		} catch (Exception e ){
			System.out.println("Erro no Delete");
		}
		 */
		
		Aluno a = alunoRep.findByCpf("000.111.222.33");
		System.err.println(a.getNome() + "(" + a.getCpf()+ ")");
		
		Iterable<Aluno> lista = alunoRep.findAll();
		for (Aluno aluno : lista) {
			System.out.println(aluno.getNome() + " " + aluno.getCpf() + " " + aluno.getId());
		}
	}

}
