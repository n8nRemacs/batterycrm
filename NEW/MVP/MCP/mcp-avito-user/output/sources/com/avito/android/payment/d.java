package com.avito.android.payment;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NativeMethodsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "sberbankOnlineAppEnabled", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final d<T, R> f214003b = new d<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return C42745f0.P0(C42745f0.V(((Boolean) obj).booleanValue() ? PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_SBERBANK_APP : null));
    }
}
