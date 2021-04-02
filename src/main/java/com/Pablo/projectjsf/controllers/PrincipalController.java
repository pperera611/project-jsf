package com.Pablo.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.Pablo.projectjsf.entity.Empleado;
import com.Pablo.projectjsf.services.EmpleadoService;

//clase que se encarga de procesar info para la pantalla principal.xhtml

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	private List<Empleado> empleadosFiltrados;
	
	private EmpleadoService empleadoservice = new EmpleadoService();
	
	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 * */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	
	
	
	public void consultarEmpleados() {
				this.empleados = empleadoservice.consultarEmpleados();
	}


	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}


	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}



	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}



	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

}
