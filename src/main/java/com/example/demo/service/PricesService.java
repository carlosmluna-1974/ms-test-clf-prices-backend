package com.example.demo.service;

import com.example.demo.model.PriceProdcutRequest;
import com.example.demo.persistence.entity.PricesEntity;

/**
 * Interface Service que implementa los metodos CRUD de la tabla prices
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public interface PricesService {
	
	/**
	 * Consulta el prodcuto por ID del prodcuto.
	 * @param productId ID del prodcuto.
	 * @return Prodcuto.
	 */
	PricesEntity getPriceProdcutByID(Long productId);
	
	/**
	 * Metodo que Inserta/Actualiza un registro de  tabla PRICES
	 * @param priceRequest Request.
	 * @return Price ID.
	 */
	Long savePriceProdcut(PriceProdcutRequest priceRequest);

}
