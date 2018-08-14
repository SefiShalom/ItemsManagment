package starter.item;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private String item_no;
    private String name;
    private int amount;
    private String inventory_code;

    public Item(String item_no, String name, int amount, String inventory_code) {
        super();
        this.item_no = item_no;
        this.name = name;
        this.amount = amount;
        this.inventory_code = inventory_code;
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
