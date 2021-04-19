package com.nico.services;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

public class CalculadoraPublic {

	public static void main(String[] args) {
		// Para publicar la clase implementada:
		//Endpoint.publish("http://localhost:1550/ws/Calculadora", new CalculadoraImpl());
		
		String cadena = JOptionPane.showInputDialog(null, "Escriba un numero para la operacion, \n"
				+ "1: Sumar \n"
				+ "2: Restar \n"
				+ "3: Multiplciar \n"
				+ "4: Dividir");
		int resp = Integer.parseInt(cadena);
		CalculadoraImplService servicio = new CalculadoraImplService();
		CalculadoraImpl calImpl = servicio.getCalculadoraImplPort();
		JOptionPane.showMessageDialog(null, "Su respuesta es: " + calImpl.calcular(resp, 15, 10));
	}

}
