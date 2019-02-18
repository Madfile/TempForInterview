package com.company;

import java.math.BigDecimal;

public enum TicketEnum {

    OperaHouseTour("OH","OperaHouseTour",new BigDecimal(300.00)),
    SydneyBridgeClimb("BC","SydneyBridgeClimb", new BigDecimal(110.00)),
    SydneySkyTower("SK","SydneySkyTower",new BigDecimal(30.00));

    private String id;
    private String name;
    private BigDecimal price;

    TicketEnum(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
