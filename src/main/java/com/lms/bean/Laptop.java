package com.lms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_laptop")
public class Laptop {
	
	@Id
	@Column(name="laptop_id")
	private int laptopId;
	
	@Column(name="laptop_brandname")
	private String laptopBrandname;
	
	@Column(name="laptop_modelname")
	private String laptopModelname;
	
	@Column(name="laptop_price")
	private int laptopPrice;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopId, String laptopBrandname, String laptopModelname, int laptopPrice) {
		super();
		this.laptopId = laptopId;
		this.laptopBrandname = laptopBrandname;
		this.laptopModelname = laptopModelname;
		this.laptopPrice = laptopPrice;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopBrandname() {
		return laptopBrandname;
	}

	public void setLaptopBrandname(String laptopBrandname) {
		this.laptopBrandname = laptopBrandname;
	}

	public String getLaptopModelname() {
		return laptopModelname;
	}

	public void setLaptopModelname(String laptopModelname) {
		this.laptopModelname = laptopModelname;
	}

	public int getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopBrandname=" + laptopBrandname + ", laptopModelname="
				+ laptopModelname + ", laptopPrice=" + laptopPrice + "]";
	}

	

	
	
	

}
