package starter.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public List<Item> getAllItems(){
        List<Item> list = new ArrayList();
        for(Item item : this.itemRepository.findAll()){
            list.add(item);
        }
        return list;
    }

    public void addItem(Item item){
        this.itemRepository.save(item);
    }

    public Item getItemDetails(String id) {
        return itemRepository.findOne(id);
    }

    public void withdrawalQty(Item item) {
        Item updatedItem  = itemRepository.findOne(item.getItem_no());
        updatedItem.setAmount(updatedItem.getAmount() - item.getAmount());
        itemRepository.save(updatedItem);
    }

    public void DepositQty(Item item) {
        Item updatedItem  = itemRepository.findOne(item.getItem_no());
        updatedItem.setAmount(updatedItem.getAmount() + item.getAmount());
        itemRepository.save(updatedItem);
    }

    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }
}
