package org.generation.Secretaria.repository;

import java.util.List;

import org.generation.Secretaria.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
public List<Aluno> findAllByNomeContainingIgnoreCase (String nome);
public List<Aluno> findAllByMatriculado (boolean matriculado);
public List<Aluno> findAllBySerieContainingIgnoreCase (String serie);
}
