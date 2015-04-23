package pojos;

import java.util.ArrayList;
import pojos.Product;
import pojos.User;

public class Cart {

	private int cartID;
	private int custID;
	private int cartQuantity;
	
	private ArrayList<Product> products;
	private ArrayList<Cart> carts;
	
	public Cart() {
		// set everything as 0
		this.cartID = 0;
		this.custID = 0;
		this.cartQuantity = 0;
		this.products = null;
	}
	
	/**
	 * @param cartID
	 * @param custID
	 * @param cartQuantity
	 * @param products
	 * @param carts
	 */
	public Cart(int cartID, int custID, int cartQuantity,
			ArrayList<Product> products, ArrayList<Cart> carts) {
		this.cartID = cartID;
		this.custID = custID;
		this.cartQuantity = cartQuantity;
		this.products = products;
		this.carts = carts;
	}
	
	// overloaded method to retrieve a previously created customer cart
	public void getCustomerCart(Cart cartID){
		
	}
	
	// overloaded method to retrieve a previously created customer cart
	public void getCustomerCart(Customer customerID){
		
	}
	
	public void addItem (Customer customerID, Product productID, int quantity){
		
	}
	
	public void removeFromCart (Cart cartID, Product productID, int quantity){
		
	}

	public void updateCart (Cart cartID){
		
	}
	
	public void calculateTotal(){
		// calculate total
		// multiply with sales tax
		// return total
	}

	/**
	 * @return the cartID
	 */
	public int getCartID() {
		return cartID;
	}

	/**
	 * @param cartID the cartID to set
	 */
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	/**
	 * @return the custID
	 */
	public int getCustID() {
		return custID;
	}

	/**
	 * @param custID the custID to set
	 */
	public void setCustID(int custID) {
		this.custID = custID;
	}

	/**
	 * @return the cartQuantity
	 */
	public int getCartQuantity() {
		return cartQuantity;
	}

	/**
	 * @param cartQuantity the cartQuantity to set
	 */
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	/**
	 * @return the products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	/**
	 * @return the carts
	 */
	public ArrayList<Cart> getCarts() {
		return carts;
	}

	/**
	 * @param carts the carts to set
	 */
	public void setCarts(ArrayList<Cart> carts) {
		this.carts = carts;
	}
	
	
	
}
