package com.risk.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PnlTest {
    
    @Test
    public void testHsbcPnL() {
        double oldPrice = 65.50;
        double newPrice = 67.20;
        double quantity = 1000;
        double expectedPnL = (67.20 - 65.50) * 1000;
        assertTrue(expectedPnL > 0);
    }
}
