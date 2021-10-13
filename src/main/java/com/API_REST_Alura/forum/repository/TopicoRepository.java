package com.API_REST_Alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_REST_Alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
