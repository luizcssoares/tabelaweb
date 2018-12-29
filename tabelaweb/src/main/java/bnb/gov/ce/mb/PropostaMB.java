package bnb.gov.ce.mb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import bnb.gov.ce.entity.Autor;
import bnb.gov.ce.entity.ConsideracaoProposta;

@ManagedBean(name="propostaMB")
@ViewScoped
//@ManagedBean(value="novaPropostaMB")
//@SessionScoped
//@RequestScoped
public class PropostaMB implements Serializable {

	private List<ConsideracaoProposta> listaConsideracao;
	private List<Autor> listaAutores;	   
	private List<Autor> listaAutoresSelecionada;	

	public List<Autor> getListaAutores() {	    
		listaAutores = new ArrayList<Autor>();
	    listaAutores.add(new Autor("Luiz Carlos", "luizcssoares@gmail.com"));
	    listaAutores.add(new Autor("Luiz Claudio", "luizclaudio@gmail.com"));	    	    
		return listaAutores;
	}

	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	public List<Autor> getListaAutoresSelecionada() {
		listaAutoresSelecionada = new ArrayList<Autor>();
		return listaAutoresSelecionada;		
	}

	public void setListaAutoresSelecionada(List<Autor> listaAutoresSelecionada) {
		this.listaAutoresSelecionada = listaAutoresSelecionada;
	}
	
	public String teste() {
		System.out.println("ola mundo !!!");
		return null;
	}	
}
