package data;

public class Driver {

	public static void main(String[] args) {
		
		// Creates the OrderDB object that manages the orders.
		OrderDB orderDB = new OrderDB();
		
		// Loads the orders from the 'orders.txt' file.
		orderDB.loadOrders("orders.txt");
		
		// Displays the orders.
		orderDB.showOrders();
		
	}

}
