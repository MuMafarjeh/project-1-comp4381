package com.example.webServices;

public class Restaurant {
	String Address;
	String Location;

	public Restaurant(String address, String location) {
		super();
		Address = address;
		Location = location;
	}
	public Restaurant() {
		
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
