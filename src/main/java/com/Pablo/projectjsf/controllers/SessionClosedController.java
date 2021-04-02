/**
 * 
 */
package com.Pablo.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Pablo
 * clase que se encarga de cerrar la sesion del usuario
 */

@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesion..");
	}
	//metodo que permite cerrar la sesion del usuario y regresar al login	
	public void cerrarSession() {
		ExternalContext externalcontext = FacesContext.getCurrentInstance().getExternalContext();
		externalcontext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
		
}
}