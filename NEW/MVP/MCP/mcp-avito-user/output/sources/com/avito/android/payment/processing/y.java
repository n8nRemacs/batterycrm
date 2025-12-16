package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PaymentStatusPollingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/processing/y;", "", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface y {
    @Y61.k
    io.reactivex.rxjava3.core.z<P2<PaymentStatusResult>> a(@Y61.k String str);
}
