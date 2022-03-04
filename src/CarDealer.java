import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> cars = new HashMap<>();
        cars.put("Camry", "Toyota");
        cars.put("DeLorean", "DeLorean Motor Company");
        cars.put("Frontier", "Nissan");
        cars.put("Prius", "Toyota");

        System.out.println("What model are you looking for today?");
        System.out.print("> ");
        String desiredModel = input.nextLine();
        String make = cars.get(desiredModel);

        if (make != null) {
            System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...\n", desiredModel, make);
        } else {
            System.out.printf("Sorry, we don't have any %ss in stock.\n", desiredModel);
        }

        input.close();
    }
}

