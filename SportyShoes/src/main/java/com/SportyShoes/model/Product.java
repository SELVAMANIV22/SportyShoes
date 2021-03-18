package com.SportyShoes.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Product")
public class Product {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="product-id")
	private int id;
	@Column(name="brand")
	private String brand;
	@Column(name="price")
	private double price;
	@Column(name="season")
	private String season;
	@Column(name="cateogory")
	private String cateogory;
	@Column(name="color")
	private String color;
	public Product(int id, String brand, double price, String season, String cateogory, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.season = season;
		this.cateogory = cateogory;
		this.color = color;
	}
	public Product() {
		super();
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCateogory() {
		return cateogory;
	}
	public void setCateogory(String cateogory) {
		this.cateogory = cateogory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", price=" + price + ", season=" + season + ", cateogory="
				+ cateogory + ", color=" + color + "]";
	}
	
	

}
