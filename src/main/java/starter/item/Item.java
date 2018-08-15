package starter.item;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String item_no;
    private String name;
    private int amount;
    private String inventory_code;

    public Item(String name, int amount, String inventory_code) {
        super();
        this.name = name;
        this.amount = amount;
        this.inventory_code = inventory_code;
    }

    public Item(){

    }

    public String getItem_no() {
        return item_no;
    }

    public String getName() {
        return name;
    }

    public String getInventory_code() {
        return inventory_code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
