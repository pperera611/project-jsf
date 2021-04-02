/**
 * 
 */
package com.Pablo.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.Pablo.proyectsf.dto.UsuarioDTO;

/**
 * @author Pablo
 * clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 *
 */
@ManagedBean
public class LoginController {
	
	private String usuario;
	private String password;
	/**
	 * @return the usuario
	 */
	
	//Bean que mantiene la informacion en sesion
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		
		if (usuario.equals("admin") && password.equals("1234")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(usuario);
				usuarioDTO.setPassword(password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL,"la pagina no existe",""));

				e.printStackTrace();
			}
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario correcto",""));
		}
		else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contrasena incorrecto",""));	
		
			
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
		
		
	}
	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}
	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
