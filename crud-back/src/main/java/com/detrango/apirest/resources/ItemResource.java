package com.detrango.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detrango.apirest.models.Item;
import com.detrango.apirest.repository.ItemRepository;

@RestController
@RequestMapping(value = "/api")
public class ItemResource {

	@Autowired
	public ItemRepository itemRepository;

	@GetMapping("/itens")//READ All
	public List<Item> Listaitens() {
		return itemRepository.findAll();
	}

	@GetMapping("/itens/{id}")//READ ONE
	public Item ListaIten(@PathVariable(value = "id") long id) {
		return itemRepository.findById(id);
	}

	@PostMapping("/iten")//CREATE
	public Item salvaItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}

	@DeleteMapping("/iten")//DELETE
	public void deletaItem(@RequestBody Item item) {
		itemRepository.delete(item);
	}
	
	@PutMapping("/iten")//UPDATE
	public Item editaItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}
}
