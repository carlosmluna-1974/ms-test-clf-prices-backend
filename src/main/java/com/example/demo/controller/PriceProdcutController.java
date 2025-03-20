package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PriceProdcutRequest;
import com.example.demo.persistence.entity.PricesEntity;
import com.example.demo.service.PricesService;



@RestController
@RequestMapping("/api/prices")
public class PriceProdcutController {

	// Variabels de inyeccion de dependencias.
	private PricesService priceService;

	public PriceProdcutController(PricesService priceService) {
		this.priceService = priceService;
	}
	
	
	@GetMapping("/{prodcutId}")
    public ResponseEntity<PricesEntity> getPriceProductById(@PathVariable Long prodcutId) {  
        return ResponseEntity.ok(priceService.getPriceProdcutByID(prodcutId));
    }
	
	@PostMapping
	public ResponseEntity<Long> createPriceProduct(@RequestBody PriceProdcutRequest priceProdcut) {
        return ResponseEntity.status(HttpStatus.CREATED).body(priceService.savePriceProdcut(priceProdcut));
    }
	
}
