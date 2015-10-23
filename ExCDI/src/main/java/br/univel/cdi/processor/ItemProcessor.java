package br.univel.cdi.processor;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.univel.cdi.annotations.Demo;
import br.univel.cdi.entidades.Item;
import br.univel.cdi.interfaces.ItemDao;

@Named
@RequestScoped
public class ItemProcessor {

	@Demo
	private ItemDao itemDao;

    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            System.out.println("Found item " + item);
        }
    }
	
}
