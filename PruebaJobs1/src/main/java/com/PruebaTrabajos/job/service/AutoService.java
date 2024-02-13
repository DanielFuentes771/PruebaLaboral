package com.PruebaTrabajos.job.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PruebaTrabajos.job.entity.Chip;
import com.PruebaTrabajos.job.repository.AutoRepository;

@Service
public class AutoService {

	@Autowired
	private AutoRepository repository;	
	public List<Chip> getAutoByActivo(Boolean activo) {
		return repository.findByActivo(activo);
	}
	


}
