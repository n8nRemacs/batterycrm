package com.avito.android.gig_motivation_payment;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GigMotivationPaymentTypeDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/PaymentType;", "", "_avito_gig_motivation-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentType {

    /* renamed from: b, reason: collision with root package name */
    public static final PaymentType f160087b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentType f160088c;

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentType f160089d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PaymentType[] f160090e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f160091f;

    static {
        PaymentType paymentType = new PaymentType("Sign", 0);
        f160087b = paymentType;
        PaymentType paymentType2 = new PaymentType("Retry", 1);
        f160088c = paymentType2;
        PaymentType paymentType3 = new PaymentType("Unknown", 2);
        f160089d = paymentType3;
        PaymentType[] paymentTypeArr = {paymentType, paymentType2, paymentType3};
        f160090e = paymentTypeArr;
        f160091f = c.a(paymentTypeArr);
    }

    public PaymentType() {
        throw null;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) f160090e.clone();
    }
}
