package br.univel.cdi.interfaces;

import java.util.List;

import br.univel.cdi.entidades.Item;

public interface ItemDao {

	List<Item> fetchItems();
	
}
