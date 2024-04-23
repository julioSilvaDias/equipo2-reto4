package spotify.bbdd.pojos;

import java.util.Date;
import java.util.Objects;

public class Usuario {
	
	private Date fechaRegistro = null;
	private boolean admin = false;
	private String password = null;
	private String login = null;
	private int id= 0;
	private Date fechaNacimiento = null;
	private String provincia = null;
	private String ciudad = null;
	private int codigoPostal = 0;
	private Date ultimaSesion = null;
	private String apellido2 = null;
	private String apellido1 = null;
	private String nombre = null;
	private String dni = null;
	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	/**
	 * @return the admin
	 */
	public boolean isAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
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
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return the ultimaSesion
	 */
	public Date getUltimaSesion() {
		return ultimaSesion;
	}
	/**
	 * @param ultimaSesion the ultimaSesion to set
	 */
	public void setUltimaSesion(Date ultimaSesion) {
		this.ultimaSesion = ultimaSesion;
	}
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(admin, apellido1, apellido2, ciudad, codigoPostal, dni, fechaNacimiento, fechaRegistro, id,
				login, nombre, password, provincia, ultimaSesion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return admin == other.admin && Objects.equals(apellido1, other.apellido1)
				&& Objects.equals(apellido2, other.apellido2) && Objects.equals(ciudad, other.ciudad)
				&& codigoPostal == other.codigoPostal && Objects.equals(dni, other.dni)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(fechaRegistro, other.fechaRegistro) && id == other.id
				&& Objects.equals(login, other.login) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password) && Objects.equals(provincia, other.provincia)
				&& Objects.equals(ultimaSesion, other.ultimaSesion);
	}
	@Override
	public String toString() {
		return "Usuario [fechaRegistro=" + fechaRegistro + ", admin=" + admin + ", password=" + password + ", login="
				+ login + ", id=" + id + ", fechaNacimiento=" + fechaNacimiento + ", provincia=" + provincia
				+ ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", ultimaSesion=" + ultimaSesion
				+ ", apellido2=" + apellido2 + ", apellido1=" + apellido1 + ", nombre=" + nombre + ", dni=" + dni + "]";
	}

}
