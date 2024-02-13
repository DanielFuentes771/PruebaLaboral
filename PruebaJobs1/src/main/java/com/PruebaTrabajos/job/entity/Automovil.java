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
@Table(name = "Automovil")
public class Automovil {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String color;
	private String placas;
	private String marca;
	private String modelo;
	private Date fechaAlta;
	private Date fechaActualizacion;
	private Boolean activo;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_chip")
	private Chip chip;
	
	
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
