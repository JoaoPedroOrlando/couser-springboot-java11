package com.example.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code){
		this.code = code;
	}
	
	public  int getCode() {
		return this.code;
	}
	
	public static OrderStatus valueOf(int code) {
		// el = um elemento do OrderStatus
		for ( OrderStatus el : OrderStatus.values()){
			if(el.getCode() == code) {
				return el;
			}
		}
		
		throw new IllegalArgumentException("Iligal OrderStatus code");
	}
}
