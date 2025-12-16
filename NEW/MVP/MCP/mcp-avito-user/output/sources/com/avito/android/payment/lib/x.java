package com.avito.android.payment.lib;

import com.avito.android.remote.model.payment.service.PaymentSessionResult;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PaymentMethodsViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "it", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final x<T, R> f214766b = new x<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return C42745f0.H(((PaymentSessionResult) obj).getPaymentMethods());
    }
}
