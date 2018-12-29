package bnb.gov.ce.entity;

import java.io.Serializable;

public class Autor implements Serializable{
	
	private String nome;
	private String  email;
	private boolean selected; 
	
	public Autor(String nome, String email) {
    	this.nome = nome;
    	this.email = email;
    	this.selected = false;
    } 	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
