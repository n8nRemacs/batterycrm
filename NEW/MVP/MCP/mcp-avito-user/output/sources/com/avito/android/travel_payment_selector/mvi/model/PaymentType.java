package com.avito.android.travel_payment_selector.mvi.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/model/PaymentType;", "", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PaymentType[] f302694b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f302695c;

    static {
        PaymentType[] paymentTypeArr = {new PaymentType("PREPAID", 0), new PaymentType("INSTALLMENTS", 1)};
        f302694b = paymentTypeArr;
        f302695c = kotlin.enums.c.a(paymentTypeArr);
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) f302694b.clone();
    }
}
