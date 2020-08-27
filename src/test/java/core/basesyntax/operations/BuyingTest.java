package core.basesyntax.operations;

import core.basesyntax.customExceptions.NoRequiredQuantityOfFruits;
import core.basesyntax.orderProcessing.OrdersReader;
import core.basesyntax.orderProcessing.OrdersStorage;
import core.basesyntax.orderProcessing.StoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;

public class BuyingTest {
    private final String BUY_PATH =
            "C:\\Users\\User\\IdeaProjects\\JUnit-practice\\src\\test\\resources\\buy.csv";
    private final String BUY_MORE_PATH =
            "C:\\Users\\User\\IdeaProjects\\JUnit-practice\\src\\test\\resources\\buyMoreThanHave.csv";
    private OrdersReader ordersReader;
    private OrdersStorage ordersStorage;
    private StoreService storeService;

    @Before
    public void setUp() {
        ordersReader = new OrdersReader();
        ordersStorage = new OrdersStorage();
        storeService = new StoreService();
    }

    @Test
    public void performBuyOrderOk() {
        ordersStorage.addOrders(ordersReader.formOrders(BUY_PATH));
        storeService.performOperations(ordersStorage.getOrders());
        Map<String, Integer> map = storeService.formatResult();
        int excepted = 7;
        Assert.assertTrue(map.containsValue(excepted));
    }

    @Test(expected = NoRequiredQuantityOfFruits.class)
    public void performBuyMoreThanHave() {
        ordersStorage.addOrders(ordersReader.formOrders(BUY_MORE_PATH));
        storeService.performOperations(ordersStorage.getOrders());
    }
}
