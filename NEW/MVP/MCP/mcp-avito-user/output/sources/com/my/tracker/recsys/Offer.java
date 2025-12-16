package com.my.tracker.recsys;

/* loaded from: classes7.dex */
public final class Offer {
    public final double discountPrice;
    public final int discountValue;
    public final String itemId;
    public final String placementId;
    public final double price;
    public final int splitId;
    public final int testId;
    public final int value;

    public Offer(String str, String str2, double d12, double d13, int i12, int i13, int i14, int i15) {
        this.placementId = str;
        this.itemId = str2;
        this.price = d12;
        this.discountPrice = d13;
        this.value = i12;
        this.discountValue = i13;
        this.testId = i14;
        this.splitId = i15;
    }
}
