package kreacyjneObserver.notification;

import kreacyjneObserver.Order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order){
        System.out.println("App - Zamówienie numer: "+order.getOrderNumber()+" zmieniło status na: "+order.getOrderStatus());
    }
}
