package com.curso.servicio.dto;

import javax.persistence.Embedded;



public class GasolineraDTO {

	private Integer id;
	private String nombre;
	private DireccionDTO direccion;
	private String telefono;
	private PrecioCombustibleDTO precioActual;
	
}
