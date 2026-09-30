package data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OrderDB {
	
	// Creates the empty array for orders to go into.
	private Order[] orders = new Order [50];
	
	
	public void loadOrders(String fileName){

		try {
			
			// Opens file.
			Scanner inFile = new Scanner (new FileReader(fileName));
			
			// Skips first line in file.
			inFile.nextLine();
			
			// Tracks array positioning.
			int index = 0;
			
			while (inFile.hasNextLine()) {
				
				// orderId, customerName, product, totalAmt, orderDate.
				String[] line = inFile.nextLine().split(",");
				
				// Converts and stores each field from the file.
				int orderId = Integer.parseInt(line[0]);
				String customerName = line[1];
				String product = line[2];
				double totalAmt = Double.parseDouble(line[3]);
				String orderDate = line[4];
				
				// Creates an Order object using the current record.
				Order newOrder  = new Order(orderId, customerName, product, totalAmt, orderDate);
				
				// Stores the Order object reference in array 
				// and moves to next position.
				orders[index] = newOrder;
				index++;	
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.print("File not found.");
		}
		
	}
	
	public void showOrders() {

		// Prints header.
		System.out.printf("Order ID Product\t\t\tTotal Amt\n");
		System.out.printf("-------- -------\t\t\t---------\n");
		
		// Prints 50 rows containing orderId, product,
		// and totalAmt.
		for(int i = 0; i < orders.length; i++) {
			System.out.printf("%d\t %-33s%7.2f%n", 
					orders[i].getOrderId(),
					orders[i].getProduct(),
					orders[i].getTotalAmt()
					);
		}
		
	}
	
}
