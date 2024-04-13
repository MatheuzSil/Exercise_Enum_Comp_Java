package entities;
public class ShowOrder {

    private OrderCar orderCar;


    public ShowOrder(OrderCar orderCar){
        this.orderCar = orderCar;
    }

    public double itemsSubtotal(){
        int quantity = orderCar.items.size();
        double subTotal = 1000 * quantity;
        return subTotal;
    }

    public double subTotal(){
        double subTotal = 120000 + itemsSubtotal() ;
        return subTotal;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Successful purchase!" + "\n");
        sb.append("Brand: " + orderCar.getBrand() + "\n");
        sb.append("Model: " + orderCar.getModel() + "\n");
        sb.append("Additional items: " + orderCar.getItems() + "\n");
        sb.append("Items SubTotal: " + itemsSubtotal() + "\n");
        sb.append(String.format("SubTotal: " + subTotal(), "%.2f") );

        return sb.toString();

    }
}
