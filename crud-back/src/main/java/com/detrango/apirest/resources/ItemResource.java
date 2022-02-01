package com.detrango.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detrango.apirest.models.Item;
import com.detrango.apirest.repository.ItemRepository;

@RestController
@RequestMapping(value="/api")
public class ItemResource {

	@Autowired
	public ItemRepository itemRepository;
	
	@GetMapping("/itens")
	public List<Item> Listaitens(){
		return itemRepository.findAll();
	}
	
}
