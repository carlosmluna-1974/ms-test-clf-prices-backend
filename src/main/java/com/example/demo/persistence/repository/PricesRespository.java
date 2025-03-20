package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistence.entity.PricesEntity;



/**
 * Interface Repository que implementa los metodos JPA de la entidad Prices
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
@Repository
public interface PricesRespository extends JpaRepository<PricesEntity, Long> {
	
	/**
	 * Metodo que hace una la consulta del pri¿ecio por medio del id de prodcuto
	 * @param prodcutId Procut ID.
	 * @return Prices
	 */
	PricesEntity findByProdcutId(Long prodcutId);

}
