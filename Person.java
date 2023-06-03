package com.git;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Person {
	private int id;
	private String name;
	private String addressString;
	private long phone;

	@OneToOne
	private Pan_card pan_card;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Pan_card getPan_card() {
		return pan_card;
	}

	public void setPan_card(Pan_card pan_card) {
		this.pan_card = pan_card;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addressString=" + addressString + ", phone=" + phone
				+ ", pan_card=" + pan_card + "]";
	}

}
