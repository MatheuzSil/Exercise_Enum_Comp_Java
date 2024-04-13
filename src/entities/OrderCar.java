package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderCar {
    private String brand;
    private String model;

    List <String> items = new ArrayList<>();


    public OrderCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public List<String> getItems() {
        return items;
    }

    public void addItems(String item){
        items.add(item);

    }

    public void  removeItems(String item){
        items.remove(item);
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "OrderCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", items: " + items +
                '}';
    }
}
