package com.company;

import java.math.BigDecimal;

public class GlobalVar {
    //0 for weekly special going on, 1 for none special
    public static int weeklySpecialIsOn = 0;

    //buy N ticket but pay for M only
    public static int NForMTickets_N = 3;
    public static int NForMTickets_M = 2;

    //bulk threshold
    public static int bulkThresholdForSK = 4;
    public static BigDecimal afterDiscountRate = new BigDecimal(0.8);
}
