package com.avito.android.payment.processing;

import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.util.InterfaceC35745a5;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import u60.InterfaceC48808a;

/* compiled from: PaymentGenericInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/processing/f;", "Lcom/avito/android/payment/processing/b;", "Lcom/avito/android/payment/caching_interactor/a;", "Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements InterfaceC33029b, com.avito.android.payment.caching_interactor.a<PaymentGenericResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.payment.caching_interactor.d<PaymentGenericResult> f214794a;

    public f(@Y61.k InterfaceC48808a interfaceC48808a, @Y61.k String str, @Y61.k String str2, @Y61.k LinkedHashMap linkedHashMap, @Y61.k PaymentSessionTypeMarker paymentSessionTypeMarker, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f214794a = new com.avito.android.payment.caching_interactor.d<>(interfaceC35745a5, null, new C33030c(paymentSessionTypeMarker, interfaceC48808a, str, str2, linkedHashMap), d.f214792l, e.f214793l);
    }
}
