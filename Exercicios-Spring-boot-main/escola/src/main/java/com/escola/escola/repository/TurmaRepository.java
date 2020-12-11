package com.escola.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.escola.model.Turma;
@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
	public List<Turma> findAllByNomeContainingIgnoreCase(String nome);
						
}
