package demo.order;

import javax.jws.WebService;

@WebService
public interface OrderProcess {
    String processOrder(Order order);
    String checkItemAvailabiliy(Order order);
}

