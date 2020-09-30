package com.exercicio.exercicio.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/exercicio")
public class ExercicioController {
	
	@GetMapping("/ex1")
	public String getEx1()
	{
	 return "Quais habilidades e mentalidades que você utilizou para realizar essa atividade? \n(1) Mentalidades \n- Mentalidade de Crescimento  \n- Persistencia   \n\n(2) Habilidades \n- Orientação ao detalhe \n- Precisão Tecnica";
	}
	@GetMapping("/ex2")
	public String getEx2()
	{
	return "Quais os seus objetivos de aprendizagem para essa semana? \n- Focar nas habilidade de Gerenciamento de Tempo, Atenção ao detalhe e Precisão Tecnica ";
	}
}
