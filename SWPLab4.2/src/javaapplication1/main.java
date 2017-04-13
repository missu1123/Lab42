package javaapplication1;

public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
        System.out.println("\n");
        product.changeBalance(123);
    	System.out.println("New product value is " + product.countValue());
    	product.printProduct();
     }

}
