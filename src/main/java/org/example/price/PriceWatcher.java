package org.example.price;

public class PriceWatcher {

    private final PriceService priceService;
    private final NotificationService notificationService;

    public PriceWatcher(PriceService priceService, NotificationService notificationService) {
        this.priceService = priceService;
        this.notificationService = notificationService;
    }

    public void checkPrices() {
        var price = priceService.getPrice("T-Shirt");
        if (price < 100)
            notificationService.notify("T-Shirt", price);
    }
}
