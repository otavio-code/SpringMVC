package br.sp.senai.spring_escola.escola.repository;

import org.springframework.data.repository.CrudRepository;

import br.sp.senai.spring_escola.escola.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	
	public Aluno findByNome(String a);
	
	public Aluno findByCpf(String a);

}
