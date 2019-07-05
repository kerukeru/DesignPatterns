package kreacyjneObserver.notification;

import kreacyjneObserver.Order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order){
        System.out.println("SMS - Zamówienie numer: "+order.getOrderNumber()+" zmieniło status na: "+order.getOrderStatus());
    }
}
