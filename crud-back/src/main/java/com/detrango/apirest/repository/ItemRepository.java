package com.detrango.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detrango.apirest.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	Item findById (long id);
}
