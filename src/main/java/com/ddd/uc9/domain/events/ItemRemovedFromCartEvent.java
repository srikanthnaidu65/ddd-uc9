package com.ddd.uc9.domain.events;

public class ItemRemovedFromCartEvent implements DomainEvent {
    private String productName;

    public ItemRemovedFromCartEvent(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
