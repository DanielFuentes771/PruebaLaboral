package com.PruebaTrabajos.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PruebaTrabajos.job.entity.Chip;
import com.PruebaTrabajos.job.service.AutoService;

@RestController
public class AutoController {
	@Autowired
	private AutoService service;
	@GetMapping("/retrieveAutos")
	public List<Chip> retrieveAutos() {
		return service.getAutoByActivo(true);
	}
	
}
