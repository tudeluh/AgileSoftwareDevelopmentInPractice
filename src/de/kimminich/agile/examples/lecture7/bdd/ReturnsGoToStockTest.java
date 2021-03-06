package de.kimminich.agile.examples.lecture7.bdd;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class ReturnsGoToStockTest {

    @Test
    public void shouldReturnRefundedItemToStock() {
        // given
        Order order = new Order("Black Sweater");
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Black Sweater", 3);
        Store store = new Store("Manfred", stock);
        // when
        store.receiveReturnFrom(order);
        // then
        assertEquals(4, store.getStockCountFor("Black Sweater"));
    }

}
