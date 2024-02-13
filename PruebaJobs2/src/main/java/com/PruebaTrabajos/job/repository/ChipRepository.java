package com.PruebaTrabajos.job.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.PruebaTrabajos.job.entity.Automovil;
import java.util.stream.Stream;

public interface ChipRepository extends JpaRepository<Automovil, Integer>{

	 @Query("SELECT a FROM Automovil a WHERE a.marca = :marca")
	 default
	    Stream<Automovil> findByMarca(@Param("marca") String marca){
		 return findAll().stream();
	 };

	    @Query("SELECT a FROM Automovil a WHERE a.modelo = :modelo")
	    default
	    Stream<Automovil> findByModelo(@Param("modelo") String modelo){
			 return findAll().stream();
		 };

	    @Query("SELECT a FROM Automovil a WHERE a.nombre = :nombre")
	    default
	    Stream<Automovil> findByNombre(@Param("nombre") String nombre){
			 return findAll().stream();
		 };


}





