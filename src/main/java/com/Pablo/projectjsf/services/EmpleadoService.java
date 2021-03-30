/**
 * 
 */
package com.Pablo.projectjsf.services;
import java.util.ArrayList;
import java.util.List;

import com.Pablo.projectjsf.entity.Empleado;



/**
 * @author Pablo
 * Clase que permite realizar la logica de negocio para empleados
 *
 */
public class EmpleadoService {

	/*
	 * Metodo que permite consultar lista de empleados
	 * @return {@link Empleado} lista de empleados
	 * */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPapellido("Paniagua");
		empleadoIBM.setSapellido("Lopez");
		empleadoIBM.setPuesto("Senior developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPapellido("Lopez");
		empleadoMicrosoft.setSapellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPapellido("Lopez");
		empleadoApple.setSapellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
		
		
		
	}
	
	
}
