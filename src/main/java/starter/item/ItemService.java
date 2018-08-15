package starter.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public void addItem(Item item){
        this.itemRepository.save(item);
    }

}