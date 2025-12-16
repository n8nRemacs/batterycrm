package com.avito.android.payment.lib.di;

import arrow.core.C23678f0;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.payment.lib.PaymentActivity;
import com.avito.android.payment.lib.PaymentSessionType;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PaymentMethodsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/lib/di/c;", "", "a", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PaymentMethodsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/di/c$a;", "", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@Y61.k b bVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k PaymentActivity paymentActivity, @h31.b @Y61.k PaymentSessionType paymentSessionType, @h31.b @Y61.k C23678f0 c23678f0, @v @h31.b boolean z12);
    }

    void a(@Y61.k PaymentActivity paymentActivity);
}
