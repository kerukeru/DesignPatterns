package kreacyjneObserver;

import kreacyjneObserver.Order.Order;

import kreacyjneObserver.Order.OrderStatus;
import kreacyjneObserver.notification.Email;
import kreacyjneObserver.notification.MobileApp;
import kreacyjneObserver.notification.TextMessage;


public class Main {
//apka netowa do wysyłania i odbierania zamówień
    public static void main(String[] args) {
        Order order = new Order(110L,OrderStatus.ZAREJESTROWANE);

        TextMessage txtMessage = new TextMessage();
        Email email = new Email();
        MobileApp app = new MobileApp();

        txtMessage.updateOrderStatus(order);
        email.updateOrderStatus(order);
        app.updateOrderStatus(order);

    }
}
