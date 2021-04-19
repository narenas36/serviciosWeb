package com.nico.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
	// Int opcion: dependiendo numero digitado sera el tipo de operacion
	// Int val1: primer valor
	// Int val2: segundo valor
	@WebMethod
	public double calcular(int opcion, double val1, double val2);
}
