package net.baccredomatic.taller.taller.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AGENCY")
public class Agency implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8923163296313128099L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agency")
	private int id;

	@Column(name = "name", unique = true, length = 80)
	private String nameAgency;

	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAgency() {
		return nameAgency;
	}

	public void setNameAgency(String nameAgency) {
		this.nameAgency = nameAgency;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
