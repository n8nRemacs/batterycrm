package com.avito.android.payment.lib;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/PaymentResult;", "", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentResult {

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentResult f214549c;

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentResult f214550d;

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentResult f214551e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PaymentResult[] f214552f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f214553g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f214554b;

    static {
        PaymentResult paymentResult = new PaymentResult("ACTIVE", 0, "active");
        f214549c = paymentResult;
        PaymentResult paymentResult2 = new PaymentResult("SUCCESS", 1, "success");
        f214550d = paymentResult2;
        PaymentResult paymentResult3 = new PaymentResult("FAILURE", 2, "failure");
        f214551e = paymentResult3;
        PaymentResult[] paymentResultArr = {paymentResult, paymentResult2, paymentResult3};
        f214552f = paymentResultArr;
        f214553g = kotlin.enums.c.a(paymentResultArr);
    }

    public PaymentResult(String str, int i12, String str2) {
        this.f214554b = str2;
    }

    public static PaymentResult valueOf(String str) {
        return (PaymentResult) Enum.valueOf(PaymentResult.class, str);
    }

    public static PaymentResult[] values() {
        return (PaymentResult[]) f214552f.clone();
    }
}
