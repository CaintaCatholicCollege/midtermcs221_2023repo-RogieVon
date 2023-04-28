import java.util.Scanner;

// Rogie Von C. Ibañez BSCS 2-A

public class Pizzaorderingprogram {

    private String size;
    private int numToppings;
    private double price;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void calculatePrice() {
        // Calculate price based on size and number of toppings
        double basePrice;
        switch (size.toLowerCase()) {
            case "small":
                basePrice = 6.99;
                break;
            case "medium":
                basePrice = 8.99;
                break;
            case "large":
                basePrice = 10.99;
                break;
            default:
                basePrice = 0.0;
                break;
        }

        double toppingsPrice;
        switch (numToppings) {
            case 1:
                toppingsPrice = 0.99;
                break;
            case 2:
                toppingsPrice = 1.99;
                break;
            case 3:
                toppingsPrice = 2.99;
                break;
            case 4:
                toppingsPrice = 3.99;
                break;
            default:
                toppingsPrice = 0.0;
                break;
        }

        price = basePrice + toppingsPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get pizza size from user
        System.out.println("What size pizza would you like? (small/medium/large)");
        String size = scanner.nextLine();

        // Get number of toppings from user
        System.out.println("How many toppings would you like? (1/2/3/4)");
        int numToppings = scanner.nextInt();

        // Create Pizza object and set size and number of toppings
        Pizzaorderingprogram pizza = new Pizzaorderingprogram();
        pizza.setSize(size);
        pizza.setNumToppings(numToppings);

        // Calculate price and display pizza size, toppings, and price
        pizza.calculatePrice();
        System.out.printf("You ordered a %s pizza with %d toppings. The total price is $%.2f.", 
                          pizza.getSize(), pizza.getNumToppings(), pizza.getPrice());
    }

}