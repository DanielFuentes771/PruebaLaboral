package com.PruebaTrabajos.job.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PruebaTrabajos.job.entity.*;
import com.PruebaTrabajos.job.service.AutoService;
import com.PruebaTrabajos.job.repository.*;
//@RestController
@Controller
@RequestMapping("/autos")
public class AutoController {
	@Autowired
	private AutoService service;
	private ChipRepository automovilRepository;	
	@GetMapping("/view")
	public String viewAutomovil(Model modelo){
		List<Chip> autos = service.getAutoByActivo(true);
        modelo.addAttribute("autos", autos);
		return "index";
	}
    @GetMapping("/buscarAutomovil")
    public Stream<Automovil> buscarAutomoviles(
            @RequestParam(required = false) String marca,
            @RequestParam(required = false) String modelo,
            @RequestParam(required = false) String placas
    ) {
        if (marca != null) {
            return automovilRepository.findByMarca(marca);
        } else if (modelo != null) {
            return automovilRepository.findByModelo(modelo);
        } else if (placas != null) {
            return automovilRepository.findByNombre(placas);
        } else {
            return (Stream<Automovil>) automovilRepository.findAll();
        }
    }
	
}
