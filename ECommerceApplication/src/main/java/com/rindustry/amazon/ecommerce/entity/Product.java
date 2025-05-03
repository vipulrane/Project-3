package com.rindustry.amazon.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pdoduct")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	Integer product_id;
	@Column(name = "prodcut_name")
	String prodcut_name;
	@Column(name = "product_category")
	String product_category;
	@Column(name = "product_price")
	Integer product_price;

	public Product(Integer product_id, String prodcut_name, String product_category, Integer product_price) {
		this.product_id = product_id;
		this.prodcut_name = prodcut_name;
		this.product_category = product_category;
		this.product_price = product_price;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProdcut_name() {
		return prodcut_name;
	}

	public void setProdcut_name(String prodcut_name) {
		this.prodcut_name = prodcut_name;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", prodcut_name=" + prodcut_name + ", product_category="
				+ product_category + ", product_price=" + product_price + "]";
	}

}
