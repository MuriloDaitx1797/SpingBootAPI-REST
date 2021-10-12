package com.API_REST_Alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.API_REST_Alura_Forum.Model.Curso;
import com.API_REST_Alura_Forum.Model.Topico;

@Controller
public class TopicsController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista(){
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Sprin", "Programacao"));
		
		return Arrays.asList(topico, topico, topico);
	}
}
