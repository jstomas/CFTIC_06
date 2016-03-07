package com.curso.modelo.entidad;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.curso.servicio.dto.DireccionDTO;

@Entity
@Table(name="gasolineras")

public class Gasolinera {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	@Embedded
	private DireccionDTO direccion;
	private String telefono;	
	
	@OneToMany(mappedBy="gasolinera") 
	private List<PrecioCombustible> preciosCombustible;

	public Gasolinera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gasolinera(Integer id, String nombre, DireccionDTO direccion, String telefono,
			List<PrecioCombustible> preciosCombustible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.preciosCombustible = preciosCombustible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DireccionDTO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDTO direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<PrecioCombustible> getPreciosCombustible() {
		return preciosCombustible;
	}

	public void setPreciosCombustible(List<PrecioCombustible> preciosCombustible) {
		this.preciosCombustible = preciosCombustible;
	}

	@Override
	public String toString() {
		return "Gasolinera [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}




}

