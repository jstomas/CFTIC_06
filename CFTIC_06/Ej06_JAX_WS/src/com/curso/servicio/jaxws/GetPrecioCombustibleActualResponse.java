
package com.curso.servicio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.5
 * Mon Mar 07 19:52:55 CET 2016
 * Generated source version: 3.1.5
 */

@XmlRootElement(name = "getPrecioCombustibleActualResponse", namespace = "http://servicio.curso.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPrecioCombustibleActualResponse", namespace = "http://servicio.curso.com/")

public class GetPrecioCombustibleActualResponse {

    @XmlElement(name = "return")
    private com.curso.servicio.dto.PrecioCombustibleDTO _return;

    public com.curso.servicio.dto.PrecioCombustibleDTO getReturn() {
        return this._return;
    }

    public void setReturn(com.curso.servicio.dto.PrecioCombustibleDTO new_return)  {
        this._return = new_return;
    }

}

