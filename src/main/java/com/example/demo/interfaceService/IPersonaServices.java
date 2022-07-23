package com.example.demo.interfaceService;
import  java.util.List;
import java.util.Optional;

import com.example.demo.interfaces.IPersona;
import com.example.demo.modelo.Persona;

public interface IPersonaServices {
	public List<Persona>listar();
	public Optional<IPersona>listarId(int id);
	public  int save(Persona p);
	public void  delete();

}
