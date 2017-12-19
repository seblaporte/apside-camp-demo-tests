package fr.apside.demo.web.dto;

public class UserDto {

	private Integer id;

	private String name;

	private String surename;

	private String email;

	private AddressDto address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
