package com.example.demo.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad de la tabla PRICES
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
@Entity
@Table(name = "PRICES")
public class PricesEntity {

	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
	private Long id;	
	@Column(name = "PRODCUT_ID")
    private Long prodcutId;	
	@Column(name = "AMMOUNT")
    private Double ammount;
	@Column(name = "CURRENCY")
    private String currency;
	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProdcutId() {
		return prodcutId;
	}
	public void setProdcutId(Long prodcutId) {
		this.prodcutId = prodcutId;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	@Override
	public String toString() {
		return "PricesEntity [id=" + id + ", prodcutId=" + prodcutId + ", ammount=" + ammount + ", currency=" + currency
				+ "]";
	}
	
}
