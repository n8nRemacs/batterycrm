package com.my.tracker.personalize;

/* loaded from: classes7.dex */
public final class PersonalizeItem {
    public final double discountPrice;
    public final int discountValue;
    public final String payload;
    public final double price;
    public final String sku;
    public final int value;

    public PersonalizeItem(String str, String str2, double d12, double d13, int i12, int i13) {
        this.sku = str;
        this.payload = str2;
        this.price = d12;
        this.discountPrice = d13;
        this.value = i12;
        this.discountValue = i13;
    }
}
