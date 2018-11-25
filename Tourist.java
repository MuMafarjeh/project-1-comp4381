package com.example.webServices;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Tourist Model Class", description = "This model represents a Tourist object that consist of id and name")
public class Tourist {
	int id;
	String name;
	
	public Tourist() {
		
	}

	public Tourist(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@ApiModelProperty(position = 2, required = true, value="115")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ApiModelProperty(position = 1, required = true, value="Hello")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
