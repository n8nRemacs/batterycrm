package com.avito.android.payment.remote;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentSessionTypeMarker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/remote/PaymentSessionTypeMarker;", "", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentSessionTypeMarker {

    /* renamed from: b, reason: collision with root package name */
    public static final PaymentSessionTypeMarker f214815b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentSessionTypeMarker f214816c;

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentSessionTypeMarker f214817d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PaymentSessionTypeMarker[] f214818e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f214819f;

    static {
        PaymentSessionTypeMarker paymentSessionTypeMarker = new PaymentSessionTypeMarker("SERVICE", 0);
        f214815b = paymentSessionTypeMarker;
        PaymentSessionTypeMarker paymentSessionTypeMarker2 = new PaymentSessionTypeMarker("WALLET", 1);
        f214816c = paymentSessionTypeMarker2;
        PaymentSessionTypeMarker paymentSessionTypeMarker3 = new PaymentSessionTypeMarker("CPA", 2);
        f214817d = paymentSessionTypeMarker3;
        PaymentSessionTypeMarker[] paymentSessionTypeMarkerArr = {paymentSessionTypeMarker, paymentSessionTypeMarker2, paymentSessionTypeMarker3};
        f214818e = paymentSessionTypeMarkerArr;
        f214819f = c.a(paymentSessionTypeMarkerArr);
    }

    public PaymentSessionTypeMarker() {
        throw null;
    }

    public static PaymentSessionTypeMarker valueOf(String str) {
        return (PaymentSessionTypeMarker) Enum.valueOf(PaymentSessionTypeMarker.class, str);
    }

    public static PaymentSessionTypeMarker[] values() {
        return (PaymentSessionTypeMarker[]) f214818e.clone();
    }
}
