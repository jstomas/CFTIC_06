package com.curso.servicio;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.curso.servicio.dto.GasolineraDTO;
import com.curso.servicio.dto.PrecioCombustibleDTO;

@WebService
public class ServicioGasolineras {

	@WebMethod(operationName="listarPorciudad")
	public List<GasolineraDTO> listarPorCiudad(@WebParam(name="ciudad") String ciudad){
		return null;
	}
	
	public PrecioCombustibleDTO getPrecioCombustibleActual(Integer idGasolinera){
		return null;
	}
	
	public PrecioCombustibleDTO getPrecioCombustibleFecha(Integer idGasolinera, Date fecha){
		return null;
	}
	
	public GasolineraDTO getGasolineraMasBarata(String ciudad, String combustible){
		return null;
	}

	public List<PrecioCombustibleDTO> getHistoricoGasolinera(Integer idGasolinera){
		return null;
	}
	
	 	
	
}
