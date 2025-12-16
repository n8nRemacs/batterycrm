package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.DeliveryOrderPaymentSuccessLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvideDeliveryOrderPaymentSuccessHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32972c f214013a;

    public e(C32972c c32972c) {
        this.f214013a = c32972c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32972c c32972c = this.f214013a;
        C32973d.f214012a.getClass();
        return new C43834a(DeliveryOrderPaymentSuccessLink.class, null, new C43834a.b.C11809b(c32972c));
    }
}
