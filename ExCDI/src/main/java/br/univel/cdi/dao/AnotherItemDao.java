package br.univel.cdi.dao;

import java.util.ArrayList;
import java.util.List;

import br.univel.cdi.entidades.Item;
import br.univel.cdi.interfaces.ItemDao;

public class AnotherItemDao implements ItemDao {

	@Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(99, 9));
        return results;
    }
	
}
