package com.curso.servicio.dto;

import java.util.Date;

public class PrecioCombustibleDTO {

	private Integer id;
	private Date fecha;
	private Double gasolina;
	private Double gasoil;

	public PrecioCombustibleDTO() {
		super();
	}

	public PrecioCombustibleDTO(Integer id, Date fecha, Double gasolina, Double gasoil) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.gasolina = gasolina;
		this.gasoil = gasoil;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getGasolina() {
		return gasolina;
	}

	public void setGasolina(Double gasolina) {
		this.gasolina = gasolina;
	}

	public Double getGasoil() {
		return gasoil;
	}

	public void setGasoil(Double gasoil) {
		this.gasoil = gasoil;
	}

}
