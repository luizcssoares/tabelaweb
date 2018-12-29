package bnb.gov.ce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConsideracaoPropostaPK implements Serializable{
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="CD_CON_PRP", unique=true, nullable=false, precision=6)
	private long cdConPrp;
	
	@Column(name="CD_AG", unique=true, nullable=false, precision=4)
	private long cdAg;

	@Column(name="AA_PRP", unique=true, nullable=false, precision=4)
	private long aaPrp;

	@Column(name="NR_PRP", unique=true, nullable=false, precision=7)
	private long nrPrp;

	public long getCdConPrp() {
	return cdConPrp;
	}

	public void setCdConPrp(long cdConPrp) {
	this.cdConPrp = cdConPrp;
	}

	public long getCdAg() {
	return cdAg;
	}

	public void setCdAg(long cdAg) {
	this.cdAg = cdAg;
	}

	public long getAaPrp() {
	return aaPrp;
	}

	public void setAaPrp(long aaPrp) {
	this.aaPrp = aaPrp;
	}

	public long getNrPrp() {
	return nrPrp;
	}

	public void setNrPrp(long nrPrp) {
	this.nrPrp = nrPrp;
	}

	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (aaPrp ^ (aaPrp >>> 32));
	result = prime * result + (int) (cdAg ^ (cdAg >>> 32));
	result = prime * result + (int) (cdConPrp ^ (cdConPrp >>> 32));
	result = prime * result + (int) (nrPrp ^ (nrPrp >>> 32));
	return result;
	}

	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	ConsideracaoPropostaPK other = (ConsideracaoPropostaPK) obj;
	if (aaPrp != other.aaPrp)
	return false;
	if (cdAg != other.cdAg)
	return false;
	if (cdConPrp != other.cdConPrp)
	return false;
	if (nrPrp != other.nrPrp)
	return false;
	return true;
	}
	
}