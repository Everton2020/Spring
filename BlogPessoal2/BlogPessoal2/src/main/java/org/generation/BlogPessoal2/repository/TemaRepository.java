package org.generation.BlogPessoal2.repository;

import java.util.List;

import org.generation.BlogPessoal2.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
public List<Tema> findByDescricaoContainingIgnoreCase (String descricao);
}
