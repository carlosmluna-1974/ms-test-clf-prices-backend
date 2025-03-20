package com.example.demo.service.impl;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.PriceProdcutRequest;
import com.example.demo.persistence.entity.PricesEntity;
import com.example.demo.persistence.repository.PricesRespository;
import com.example.demo.service.PricesService;



@Service
public class PricesServiceImpl implements PricesService {
	
	// Variables de inyeccion
	private PricesRespository pricesRepository;
	
	public PricesServiceImpl(PricesRespository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public PricesEntity getPriceProdcutByID(Long productId) {
		PricesEntity piceEntity = pricesRepository.findByProdcutId(productId);
		if ( Objects.isNull(piceEntity) ) 
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el precio del prodcuto en la BD");	
		return piceEntity;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long savePriceProdcut(PriceProdcutRequest priceRequest) {
		PricesEntity pricesEntity = new PricesEntity();
		
		if ( Objects.nonNull(priceRequest.getId()) )
			pricesEntity.setId(priceRequest.getId());
		pricesEntity.setProdcutId(priceRequest.getProdcutId());
		pricesEntity.setAmmount(priceRequest.getAmount());
		pricesEntity.setCurrency(priceRequest.getCurency());
		
		PricesEntity priceEntityResp = pricesRepository.save(pricesEntity);
		
		return priceEntityResp.getId();
	}

}
