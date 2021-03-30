/**
 * 
 */
package com.Pablo.projectjsf.entity;

/**
 * @author Pablo
 * clase que representa entidades de empleado
 *
 */
public class Empleado {

	private String nombre;
	private String papellido;
	private String sapellido;
	private String puesto;
	private boolean estatus;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the papellido
	 */
	public String getPapellido() {
		return papellido;
	}
	/**
	 * @param papellido the papellido to set
	 */
	public void setPapellido(String papellido) {
		this.papellido = papellido;
	}
	/**
	 * @return the sapellido
	 */
	public String getSapellido() {
		return sapellido;
	}
	/**
	 * @param sapellido the sapellido to set
	 */
	public void setSapellido(String sapellido) {
		this.sapellido = sapellido;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
