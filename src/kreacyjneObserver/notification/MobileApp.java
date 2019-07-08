package kreacyjneObserver.notification;

import kreacyjneObserver.Order.Order;

public class MobileApp implements Observer{

    public void update(Order order){
        System.out.println("App - Zamówienie numer: "+order.getOrderNumber()+" zmieniło status na: "+order.getOrderStatus());
    }
}
