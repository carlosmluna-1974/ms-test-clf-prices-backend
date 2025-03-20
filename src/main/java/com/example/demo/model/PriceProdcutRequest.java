package com.example.demo.model;

public class PriceProdcutRequest {
	// Atributos de la clase
    private Long id;	
    private Long prodcutId;	
    private Double amount;    
    private String curency;
    
    
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurency() {
		return curency;
	}
	public void setCurency(String curency) {
		this.curency = curency;
	}
	
	
	@Override
	public String toString() {
		return "PriceProdcutRequest [id=" + id + ", prodcutId=" + prodcutId + ", amount=" + amount + ", curency="
				+ curency + "]";
	}
    
}
