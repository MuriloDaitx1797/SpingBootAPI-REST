package com.API_REST_Alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.API_REST_Alura.forum.controller.dto.TopicoDTO;
import com.API_REST_Alura.forum.model.Curso;
import com.API_REST_Alura.forum.model.Topico;
import com.API_REST_Alura.forum.repository.TopicoRepository;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		List<Topico> topicos = topicoRepository.findAll();
		return TopicoDTO.converter(topicos);
	}
}
