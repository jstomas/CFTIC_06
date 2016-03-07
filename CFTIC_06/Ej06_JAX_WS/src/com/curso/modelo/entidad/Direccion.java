package com.curso.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Esto no es una entidad. No tiene ID
//La dirección son columnas en la tabla gasolinera
//Es una relación de uno a uno con una sola tabla
@Embeddable
public class Direccion {

	//Puede tener cualquier anotación relacionada con las columnas
	private String ciudad;
	private String calle;
	private String numero;
	@Column(name="codigo_postal")
	private String codigoPostal;

	public Direccion() {
		super();
	}

	public Direccion(String ciudad, String calle, String numero, String codigoPostal) {
		super();
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direccion [ciudad=" + ciudad + ", calle=" + calle + ", numero=" + numero + ", codigoPostal="
				+ codigoPostal + "]";
	}

}
