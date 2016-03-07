package com.curso.modelo.entidad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="precios_combustible")

public class PrecioCombustible {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date fecha;
	private Double gasolina;
	private Double gasoil;

	@ManyToOne
	@JoinColumn(name="fk_id_gasolinera", referencedColumnName="id")
	private Gasolinera gasolinera;
	
	
	
	
	public PrecioCombustible() {
		super();
	}

	public PrecioCombustible(Integer id, Gasolinera gasolinera, Date fecha, Double gasolina, Double gasoil) {
		super();
		this.id = id;
		this.gasolinera = gasolinera;
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

	public Gasolinera getGasolinera() {
		return gasolinera;
	}

	public void setGasolinera(Gasolinera gasolinera) {
		this.gasolinera = gasolinera;
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

	@Override
	public String toString() {
		return "PrecioCombustible [id=" + id + ", gasolinera=" + gasolinera + ", fecha=" + fecha + ", gasolina="
				+ gasolina + ", gasoil=" + gasoil + ", getId()=" + getId() + ", getGasolinera()=" + getGasolinera()
				+ ", getFecha()=" + getFecha() + ", getGasolina()=" + getGasolina() + ", getGasoil()=" + getGasoil()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
