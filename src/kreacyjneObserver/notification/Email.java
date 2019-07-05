package kreacyjneObserver.notification;

import kreacyjneObserver.Order.Order;

public class Email {

    public void updateOrderStatus(Order order){
        System.out.println("Email - Zamówienie numer: "+order.getOrderNumber()+" zmieniło status na: "+order.getOrderStatus());
    }
}
