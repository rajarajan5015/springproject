package com.onesoft;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cardetails")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	
	private int id;
	private String brand;
	private String model;
	private int price;
	private String colour;
	private boolean isbs6;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isIsbs6() {
		return isbs6;
	}
	public void setIsbs6(boolean isbs6) {
		this.isbs6 = isbs6;
	}
	
	

}
