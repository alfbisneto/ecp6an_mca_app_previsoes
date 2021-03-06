package br.usjt.aula8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.aula8.model.Clima;
import br.usjt.aula8.repository.ClimaRepository;

@Controller
public class ClimaController {
	
	@Autowired
	private ClimaRepository ClimaRep;

	@GetMapping("/climas")
	public ModelAndView listarClimas() {
		ModelAndView mv = new ModelAndView("lista_climas");
		List<Clima> climas = ClimaRep.findAll();
		mv.addObject(new Clima());
		mv.addObject("climas", climas);
		return mv;
	}

	@PostMapping("/climas")
	public String salvar(Clima clima) {
		ClimaRep.save(clima);
		return "redirect:/climas";
	}
}