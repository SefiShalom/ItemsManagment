package starter.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value="/items/add-new-item", method=RequestMethod.POST)
    public void addItem(@RequestBody Item item){
        this.itemService.addItem(item);
        System.out.println("works");
    }

    @RequestMapping("/items/get-items-list")
    public List<Item> getAllItems(){
       return this.itemService.getAllItems();
    }

    @RequestMapping("/items/read-item-details/{id}")
    public Item getItemsDetails(@PathVariable String id){
        return this.itemService.getItemDetails(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/items/withdrawal-qty")
    public void withdrawalQty(@RequestBody Item item){
        System.out.println(item.getAmount());
        this.itemService.withdrawalQty(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/items/deposit-qty")
    public void DepositQty(@RequestBody Item item){
        System.out.println(item.getAmount());
        this.itemService.DepositQty(item);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/items/delete-item")
    public void deleteItem(@RequestBody Item item){
        this.itemService.deleteItem(item);
    }

}
