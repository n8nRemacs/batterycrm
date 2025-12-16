package com.avito.android.payment.processing;

import android.os.Parcelable;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.util.Kundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentGenericInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "result", "Lcom/avito/android/util/Kundle;", "kundle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;Lcom/avito/android/util/Kundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.p<PaymentGenericResult, Kundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f214792l = new d();

    public d() {
        super(2);
    }

    @Override // Y41.p
    public final G0 invoke(PaymentGenericResult paymentGenericResult, Kundle kundle) {
        PaymentGenericResult paymentGenericResult2 = paymentGenericResult;
        Kundle kundle2 = kundle;
        if (paymentGenericResult2 instanceof PaymentGenericResult.Ok) {
            kundle2.j((Parcelable) paymentGenericResult2, "PaymentGenericInteractor_cached_results");
        }
        return G0.f406611a;
    }
}
