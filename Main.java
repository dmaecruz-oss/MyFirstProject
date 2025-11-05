import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // TODO A1: Ask the user for item name, price, and quantity
        // Example:
        // Item: Milk
        // Price: 3.49
        // Quantity: 2
        System.out.print("Enter grocery item name: ");
        String Item = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        input.nextLine();

        // TODO B1: Calculate the total cost (price * quantity
        double totalCost = (price * qty);
        // TODO C1: Create a FileWriter for "receipt.txt"
        FileWriter writer = new FileWriter("receipt.txt");
        // TODO C2: Write all purchase details to the file
        writer.write("Item: " + Item + "\n");
        writer.write("Price: " + price + "\n");
        writer.write("Quantity: " + qty + "\n");
        writer.write("Total: " + totalCost);
        // TODO C3: Close the FileWriter and print "Receipt saved!"
        System.out.println("Receipt Saved");
            writer.close();
    }
}
