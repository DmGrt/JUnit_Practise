package core.basesyntax.orderProcessing;

import core.basesyntax.entries.Order;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class OrdersStorage {
    private List<Order> orders = new ArrayList<>();

    public boolean addOrders(List<Order> newOrders) {
        this.orders.addAll(newOrders);
        orders.sort(Comparator.comparing(Order::getTypeOfOperation).reversed()
                .thenComparing(Order::getFruitPack));
        return true;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
