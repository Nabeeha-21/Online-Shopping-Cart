import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart shop = new ShoppingCart();

        int choice;

        do {

            System.out.println("\n===== ONLINE SHOPPING CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Total Price");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price : ");
                    double price = sc.nextDouble();

                    shop.addProduct(name, price);
                    break;

                case 2:

                    shop.viewCart();
                    break;

                case 3:

                    shop.totalPrice();
                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}