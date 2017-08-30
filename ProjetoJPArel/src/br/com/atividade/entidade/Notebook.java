package br.com.senai.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notebook")
public class Notebook {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String numeroSerial;
	
	private int memoriaRam;
	
	private int HD;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroSerial() {
		return numeroSerial;
	}
	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	public int getHD() {
		return HD;
	}
	public void setHD(int hD) {
		HD = hD;
	}
	@Override
	public String toString() {
		return "Notebook [id=" + id + ", numeroSerial=" + numeroSerial + ", memoriaRam=" + memoriaRam + ", HD=" + HD
				+ "]";
	}
	
}
