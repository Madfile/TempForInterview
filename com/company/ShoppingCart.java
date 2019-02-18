package com.company;


import com.company.Util.FloatFormatUtil;

import java.util.ArrayList;

import static com.company.GlobalVar.*;

public class ShoppingCart {
    //number of Opera House Tour ticket
    int numOH = 0;

    //number of Opera Sydney Bridge Climb ticket
    int numBC = 0;

    //number of Sydney Sky Tower ticket
    int numSK = 0;

    public void add(TicketEnum ticket) {
        switch (ticket.getId()) {
            case "OH":
                numOH++;
                break;
            case "BC":
                numBC++;
                break;
            case "SK":
                numSK++;
                break;
        }
        return;
    }

    public void remove(TicketEnum ticket) {
        switch (ticket.getId()) {
            case "OH":
                if (numOH > 0) {
                    numOH--;
                }
                break;
            case "BC":
                if(numBC > 0) {
                    numBC--;
                }
                break;
            case "SK":
                if(numSK > 0) {
                    numSK--;
                }
                break;
        }
        return;
    }

    public void clear(){
        numSK = 0;
        numBC = 0;
        numOH = 0;
        return;
    }

    public String total() {
        if(GlobalVar.weeklySpecialIsOn == 0){
            //price for Opera House Tour
            assert NForMTickets_M <= NForMTickets_N;
            float priceForOH = (numOH/NForMTickets_N * NForMTickets_M + numOH % NForMTickets_N) * TicketEnum.OperaHouseTour.getPrice().floatValue();

            //price for Bridge Climb
            float priceForBC;
            if(numBC >= bulkThresholdForSK){
                priceForBC = numBC * TicketEnum.SydneyBridgeClimb.getPrice().floatValue() * afterDiscountRate.floatValue();
            }
            else{
                priceForBC = numBC * TicketEnum.SydneyBridgeClimb.getPrice().floatValue();
            }

            //price for Sky Tower
            float priceForSK;
            if(numOH >= numSK) {
                priceForSK = 0;
            }
            else{
                priceForSK = (numSK - numOH) * TicketEnum.SydneySkyTower.getPrice().floatValue();
            }
            return FloatFormatUtil.floatFormat(priceForBC + priceForOH + priceForSK);

        }
        else {
            return FloatFormatUtil.floatFormat(numOH * TicketEnum.OperaHouseTour.getPrice().floatValue() + numBC * TicketEnum.SydneyBridgeClimb.getPrice().floatValue() + numSK * TicketEnum.SydneySkyTower.getPrice().floatValue());
        }
    }

    public ShoppingCart() {
    }
}
