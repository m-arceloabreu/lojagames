package org.generation.lojagames.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_categoria")


public class Categoria {
      @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 private long id;
	 
      //Atributo 1
	 @NotNull
	 @Size(min = 3, max = 20 )
	 private String genero;
	 //
	 //Atributo 2
	 @NotNull
	 @Size(min = 3, max = 20)
     private String console;
	 //
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	
	//METODOS
	 

	
	
	
	

}