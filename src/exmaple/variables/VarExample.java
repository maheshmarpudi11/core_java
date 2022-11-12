package exmaple.variables;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class VarExample {

	public static void main(String[] args) {
		
		
		System.out.println(LocalDate.now());
		
		Order order1 = new Order();
		order1.setOrderDate(LocalDate.now());
		order1.setOrderId(001);
		order1.setOrderName("phone");
		
		Order order2 = new Order("laptop", 002, LocalDate.now());
		
		
		
		OrderService orderService = new OrderService();
		
		orderService.createOrder(order1);
		
		orderService.createOrder(order2);
		
		
		
	}
}

// Serive impl
class OrderService{
	
	public void createOrder(Order order) {
		System.out.println("order is created. with details  : "+ order);
	}
	
}

// BO
class Order{
	
	private String orderName;
	private int orderId;
	private LocalDate orderDate;
	
	public Order() {
		
	}
	
	public Order(String orderName, int orderId, LocalDate orderDate) {
		this.orderName = orderName;
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId + ", orderDate=" + orderDate + "]";
	}
	
}