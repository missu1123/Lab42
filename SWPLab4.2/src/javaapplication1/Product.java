/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
        private int newvalue;
        

	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
                
	}
        public int changeBalance(int newvalue) {
                this.amount = newvalue;
                return amount;
        
        }	
        public double countValue() {
		return(amount * price);
	}
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs \t", name,price,amount);
	}

      
}

