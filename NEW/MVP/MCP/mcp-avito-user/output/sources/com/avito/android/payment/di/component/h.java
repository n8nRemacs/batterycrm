package com.avito.android.payment.di.component;

import Y61.k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.payment.di.module.F;
import com.avito.android.payment.form.status.PaymentStatusFormActivity;
import h31.d;
import kotlin.Metadata;

/* compiled from: PaymentStatusFormComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/di/component/h;", "", "a", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface h {

    /* compiled from: PaymentStatusFormComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/di/component/h$a;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @k
        a a(@k PaymentStatusFormActivity paymentStatusFormActivity);

        @k
        a b(@k e eVar);

        @k
        h build();

        @k
        a c(@k F f12);
    }

    void a(@k PaymentStatusFormActivity paymentStatusFormActivity);
}
