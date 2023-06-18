package ru.netology.cashBackHacker;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void CashbackLessThousand() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackMoreThousand() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackTwoThousand() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
