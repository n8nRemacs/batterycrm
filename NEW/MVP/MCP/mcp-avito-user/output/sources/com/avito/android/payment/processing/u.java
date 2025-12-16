package com.avito.android.payment.processing;

import android.os.Parcelable;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.Kundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "result", "Lcom/avito/android/util/Kundle;", "kundle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;Lcom/avito/android/util/Kundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u extends N implements Y41.p<PaymentStatusResult, Kundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f214810l = new u();

    public u() {
        super(2);
    }

    @Override // Y41.p
    public final G0 invoke(PaymentStatusResult paymentStatusResult, Kundle kundle) {
        PaymentStatusResult paymentStatusResult2 = paymentStatusResult;
        Kundle kundle2 = kundle;
        if (paymentStatusResult2 instanceof PaymentStatusResult.PaymentStatus) {
            kundle2.j((Parcelable) paymentStatusResult2, "PaymentStatusInteractor_cached_results");
        }
        return G0.f406611a;
    }
}
