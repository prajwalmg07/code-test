import java.util.Scanner;

class Product {
    int productId;

    Product(int productId) {
        this.productId = productId;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(int productId, int warranty) {
        super(productId);
        this.warranty = warranty;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Warranty: " + warranty + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Warranty (years): ");
        int w = sc.nextInt();

        Electronics e = new Electronics(pid, w);
        e.showDetails();
    }
}