package com.avito.android.payment.di.component;

import Y61.k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.payment.di.module.C32977d;
import com.avito.android.payment.form.PaymentGenericFormActivity;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import h31.d;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/di/component/f;", "", "a", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: PaymentGenericFormComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/di/component/f$a;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a b(@k e eVar);

        @k
        f build();

        @h31.b
        @k
        a c(@k PaymentSessionTypeMarker paymentSessionTypeMarker);

        @k
        a d(@k C32977d c32977d);
    }

    void a(@k PaymentGenericFormActivity paymentGenericFormActivity);
}
