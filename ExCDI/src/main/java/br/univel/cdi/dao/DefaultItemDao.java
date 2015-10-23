package br.univel.cdi.dao;

import java.util.ArrayList;
import java.util.List;

import br.univel.cdi.annotations.Demo;
import br.univel.cdi.entidades.Item;
import br.univel.cdi.interfaces.ItemDao;

@Demo
public class DefaultItemDao implements ItemDao {

	@Override
	public List<Item> fetchItems() {
		List<Item> results = new ArrayList<Item>();
		results.add(new Item(34, 7));
		results.add(new Item(4, 37));
		results.add(new Item(24, 19));
		results.add(new Item(89, 32));
		return results;
	}

}
