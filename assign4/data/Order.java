package data;

public class Order {

	// Instance variables
	private int orderId;
	private String customerName;
	private String product;
	private double totalAmt;
	private String orderDate;
	
	// Constructor
	public Order(int orderId, String customerName, String product, double totalAmt, String orderDate) {
		
		this.orderId = orderId;
		this.customerName = customerName;
		this.product = product;
		this.totalAmt = totalAmt;
		this.orderDate = orderDate;
	}
	
	// Getters and Setters:
	// get = returns value
	// set = updates value
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public double getTotalAmt() {
		return totalAmt;
	}
	
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}



