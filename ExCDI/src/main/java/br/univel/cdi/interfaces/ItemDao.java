package br.univel.cdi.interfaces;

import java.util.List;

import javax.inject.Inject;

import br.univel.cdi.entidades.Item;

public interface ItemDao {

	@Inject
	List<Item> fetchItems();
	
}
