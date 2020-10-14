package org.generation.blogPessoal3.repository;

import java.util.List;

import org.generation.blogPessoal3.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
public List<Tema> findByDescricaoContainingIgnoreCase (String descricao);
}
