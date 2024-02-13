package com.PruebaTrabajos.job.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private Date fechaAlta;
	private Date fechaActualizacion;
	private boolean Activo;
	
	@ManyToOne
	@JoinColumn(name="id_chip")
	private Chip chip;
	
	
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
