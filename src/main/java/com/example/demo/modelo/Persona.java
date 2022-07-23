package com.example.demo.modelo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")

public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Telefono;
	
	public Persona(int id, String name, String telefono) {
		super();
		this.id = id;
		Name = name;
		Telefono = telefono;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
}
