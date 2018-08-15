package starter.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method= RequestMethod.POST, value = "/items")
    public void addItem(@RequestBody Item item){
        this.itemService.addItem(item);
    }

}
