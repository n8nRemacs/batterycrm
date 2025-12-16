package com.avito.android.autoteka.di.payment;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.di.InterfaceC30272y;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import yf.l;

/* compiled from: AutotekaPaymentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/di/payment/a;", "", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: AutotekaPaymentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/di/payment/a$a;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.autoteka.di.payment.a$a, reason: collision with other inner class name */
    public interface InterfaceC2859a {
        @k
        a a(@k l lVar, @k InterfaceC39417a interfaceC39417a, @h31.b boolean z12, @h31.b @k PaymentDetails paymentDetails, @h31.b @k Y41.l lVar2, @h31.b @k C28478k c28478k);
    }

    void a(@k AutotekaPaymentActivity autotekaPaymentActivity);
}
