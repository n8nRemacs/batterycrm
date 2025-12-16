package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.Kundle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "kundle", "Lcom/avito/android/util/Kundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class v extends N implements Y41.l<Kundle, PaymentStatusResult> {

    /* renamed from: l, reason: collision with root package name */
    public static final v f214811l = new v();

    public v() {
        super(1);
    }

    @Override // Y41.l
    public final PaymentStatusResult invoke(Kundle kundle) {
        Kundle kundle2 = kundle;
        if (kundle2.f318647b.containsKey("PaymentStatusInteractor_cached_results")) {
            return (PaymentStatusResult.PaymentStatus) kundle2.d("PaymentStatusInteractor_cached_results");
        }
        return null;
    }
}
