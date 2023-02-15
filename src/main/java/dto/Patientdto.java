package dto;

import javax.persistence.Entity;

@Entity
public class Patientdto {
	@javax.persistence.Id
	private int Id;
	 private String Name;
	 private String bg;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBg() {
		return bg;
	}
	public void setBg(String bg) {
		this.bg = bg;
	}
	 
	
	
}
