package bnb.gov.ce.mb;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import org.primefaces.component.datatable.DataTable;

import bnb.gov.ce.entity.Autor;

@ManagedBean(value="autorMB")
@SessionScoped
public class AutorMB implements Serializable{
			
	private List<Autor> autores = new ArrayList<Autor>(); 	
		
	public AutorMB() { 
				
	}
	
	@PostConstruct
    public void init() {        		
        
    }
	
	public List<Autor> getAutores() {
		autores.add(new Autor("RAQUEL DE QUEIROZ", "raquel.soares@gmail.com"));	
	    autores.add(new Autor("ARIANO SUASSUNA", "ariano.suassuna@gmail.com"));
	    autores.add(new Autor("VALESKA POPOZUDA", "valeska.popozuda@gmail.com"));
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
}
