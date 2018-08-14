package starter.item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @RequestMapping("/topics")
    public List<Item> getAllTopics(){
      return null;
    }

}
