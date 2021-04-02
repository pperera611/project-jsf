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
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		//-------------------------------------
		
		
		empleadoAmazon.setNombre("Christian");
		empleadoAmazon.setPapellido("Paniagua");
		empleadoAmazon.setSapellido("Lopez");
		empleadoAmazon.setPuesto("Senior developer Java");
		empleadoAmazon.setEstatus(true);
		
		empleadoDeloitte.setNombre("Luisa");
		empleadoDeloitte.setPapellido("Lopez");
		empleadoDeloitte.setSapellido("Romero");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(true);
		
		empleadoHP.setNombre("Lupita");
		empleadoHP.setPapellido("Lopez");
		empleadoHP.setSapellido("Romero");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);
		
		
		empleadoNetflix.setNombre("Carlos");
		empleadoNetflix.setPapellido("Paniagua");
		empleadoNetflix.setSapellido("Lopez");
		empleadoNetflix.setPuesto("Senior developer Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoOracle.setNombre("Fabian");
		empleadoOracle.setPapellido("Lopez");
		empleadoOracle.setSapellido("Romero");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(true);
		
		empleadoDisney.setNombre("Cesar");
		empleadoDisney.setPapellido("Lopez");
		empleadoDisney.setSapellido("Romero");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDisney);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoHP);
		
		
		return empleados;
		
		
		
		
	}
	
	
}
