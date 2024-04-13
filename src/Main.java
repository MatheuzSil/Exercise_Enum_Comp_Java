import entities.OrderCar;
import entities.ShowOrder;
import enums.CarBrand;
import enums.CarModel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our dealership ");
        System.out.print("What is the car brand who you want? these are the car brands we have: ");
        System.out.println(Arrays.toString(CarBrand.values()));
        String brand = sc.nextLine();
        System.out.println("GREAT CHOICE! the " + brand + " cars are the best");
        brand = brand.toUpperCase();

        switch (brand){
            case "TOYOTA":
                System.out.println("These are the Toyota cars model choose one: " + Arrays.toString(CarModel.Toyotmodel.values()));
                break;
            case "AUDI":
                System.out.println("These are the Audi cars model choose one: " + Arrays.toString(CarModel.AudiModel.values()));
                break;
            case "FORD":
                System.out.println("These are the Ford cars model choose one: " + Arrays.toString(CarModel.FordModel.values()));
                break;
            case "MERCEDES":
                System.out.println("These are the Mercedez cars model choose one: " + Arrays.toString(CarModel.MercedezModel.values()));
                break;
            case "BMW":
                System.out.println("These are the Bmw cars model choose one: " + Arrays.toString(CarModel.BmwModel.values()));
                break;
            case "Chevrolet":
                System.out.println("These are the Chevrolet cars model choose one: " + Arrays.toString(CarModel.ChevroletModel.values()));


        }
        String model = sc.nextLine();
        OrderCar orderCar = new OrderCar(brand, model );
        ShowOrder showOrder = new ShowOrder(orderCar);

        System.out.println("AWESOME! the " + model + " is perfect for you");
        System.out.println("Enter to me now how many additional thing do you want to put in your car?: ");
        int n = sc.nextInt();
        System.out.println("You select " + n);
        sc.nextLine();

        for (int i=0; i<n; i++){
            int th = i + 1;
            System.out.println("What is the "+  th + "th" );
            String additionalItems = sc.nextLine();
            orderCar.addItems(additionalItems);

        }

        System.out.println(showOrder);




        sc.close();
    }
}