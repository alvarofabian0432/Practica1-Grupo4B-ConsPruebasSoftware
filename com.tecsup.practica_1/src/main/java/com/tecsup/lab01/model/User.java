package com.tecsup.lab01.model;

// El usuario deberá tener los campos nombres, apellido paterno, edad

public class User {
	
	private String nombres;
	private String apellido_paterno;
	private int edad;
	
	public User(String nombres, String apellido_paterno, int edad) {
		super();
		this.nombres = nombres;
		this.apellido_paterno = apellido_paterno;
		this.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
