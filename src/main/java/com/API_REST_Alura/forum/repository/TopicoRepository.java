package com.API_REST_Alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_REST_Alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

}
