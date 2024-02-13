package com.PruebaTrabajos.job.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PruebaTrabajos.job.entity.Chip;

public interface AutoRepository extends JpaRepository<Chip, Integer>{

	List<Chip> findByActivo(Boolean Activo);
	
	
	
	
}




