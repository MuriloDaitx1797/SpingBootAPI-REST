package com.API_REST_Alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.API_REST_Alura.forum.controller.dto.TopicoDTO;
import com.API_REST_Alura_Forum.Model.Curso;
import com.API_REST_Alura_Forum.Model.Topico;

@RestController
public class TopicsController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		Topico topico = new Topico("Duuvida", "Duvida com Spring", new Curso("Sprin", "Programacao"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}
}
