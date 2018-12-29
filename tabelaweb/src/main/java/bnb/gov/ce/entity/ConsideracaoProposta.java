package bnb.gov.ce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

public class ConsideracaoProposta implements Serializable{
	 private static final long serialVersionUID = 1L;
	
	   @EmbeddedId
	   private ConsideracaoPropostaPK id;

	   @Column(name="NR_LAU", nullable=false, precision=4)
	   private BigDecimal nrLau;	
	   
	   @Column(name="VR_PRJ", nullable=true, precision=10, scale=2)
	   private double vrPrj;
	   
	   @Column(name="CO_LAU", length=120, nullable=true)
	   private String coLau;
	   	   
	   @Column(name="DT_CCL", nullable=true)
	   private Timestamp dtCcl;
	   	   	    	   	  	   	    
	   @Column(name="DT_PRC", nullable=false)
	   private Timestamp dtPrc;

	public ConsideracaoPropostaPK getId() {
	return id;
	}

	public void setId(ConsideracaoPropostaPK id) {
	this.id = id;
	}

	public BigDecimal getNrLau() {
	return nrLau;
	}

	public void setNrLau(BigDecimal nrLau) {
	this.nrLau = nrLau;
	}

	public double getVrPrj() {
	return vrPrj;
	}

	public void setVrPrj(double vrPrj) {
	this.vrPrj = vrPrj;
	}

	public String getCoLau() {
	return coLau;
	}

	public void setCoLau(String coLau) {
	this.coLau = coLau;
	}

	public Timestamp getDtCcl() {
	return dtCcl;
	}

	public void setDtCcl(Timestamp dtCcl) {
	this.dtCcl = dtCcl;
	}

	public Timestamp getDtPrc() {
	return dtPrc;
	}

	public void setDtPrc(Timestamp dtPrc) {
	this.dtPrc = dtPrc;
	}
	   	   	   
}


