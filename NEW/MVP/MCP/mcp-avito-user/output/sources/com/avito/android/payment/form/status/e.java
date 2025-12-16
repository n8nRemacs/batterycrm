package com.avito.android.payment.form.status;

import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PaymentStatusFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/status/e;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {
    @Y61.k
    io.reactivex.rxjava3.core.z<P2<PaymentStatusFormResult>> a();

    @Y61.k
    Kundle d0();
}
