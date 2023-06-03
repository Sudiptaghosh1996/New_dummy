package com.git;

import javax.persistence.Entity;

@Entity
public class Pan_card {

	private int id;
	private String pan_no;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Pan_card [id=" + id + ", pan_no=" + pan_no + ", address=" + address + "]";
	}

}
