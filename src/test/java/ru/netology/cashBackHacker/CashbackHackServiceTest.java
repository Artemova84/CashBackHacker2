package ru.netology.cashBackHacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void CashbackLessThousand(){
        CashbackHackService cashback = new CashbackHackService();
        int expected = 100;
        int actual = cashback.remain(900);
        assertEquals(expected, actual);
    }
    @Test
    public void CashbackMoreThousand(){
        CashbackHackService cashback = new CashbackHackService();
        int expected = 900;
        int actual = cashback.remain(1100);
        assertEquals(expected, actual);
    }
    @Test
    public void CashbackTwoThousand(){
        CashbackHackService cashback = new CashbackHackService();
        int expected = 0;
        int actual = cashback.remain(1000);
        assertEquals(expected, actual);
    }
}
