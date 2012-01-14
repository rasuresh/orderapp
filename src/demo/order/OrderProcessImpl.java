package demo.order; 

import javax.jws.WebService;

@WebService
public class OrderProcessImpl implements OrderProcess {

    public String processOrder(Order order) {
		String orderID = validate(order);
        return orderID;
    }

	/**
	 * Validates the order and returns the order ID
	**/
	private String validate(Order order) {
		String custID = order.getCustomerID();
		String itemID = order.getItemID();
		int qty = order.getQty();
		double price = order.getPrice();

		if (custID != null && itemID != null && !custID.equals("") && !itemID.equals("") && qty > 0 && price > 0.0) {
			return "ORD1234SURESH";
		}
		return null;
	}

	public String checkItemAvailabiliy(Order order) {
		if(order!= null){
			if( order.getItemID().equalsIgnoreCase("ITM1")){
				return "Y";
			}else{
				return "N";
			}
		}
		return null;
	}
}
