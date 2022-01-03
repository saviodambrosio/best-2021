package org.generation.italy.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")	
	public String index(Model model) {
		model.addAttribute("name", "Savio");		
		return "index";
	}
	
	
	@GetMapping("/movies")	
	public String movies(Model model) {
		model.addAttribute("movies", Arrays.asList("La mano de dios(Paolo Sorrentino)","C'era una volta a Hollywood(Quentin Tarantino)","The Irishman(Martin Scorsese)"));		
		return "movies";
	}
	
	@GetMapping("/songs")	
	public String songs(Model model) {
		model.addAttribute("songs", Arrays.asList("Guerriero(Don joe,Marracash,Venerus)","Invincible(Pop Smoke)","Energy(Drake)"));		
		return "songs";
	}
	
		
	
	
}
