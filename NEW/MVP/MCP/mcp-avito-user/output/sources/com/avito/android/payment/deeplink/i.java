package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentSessionCpaLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentSessionCpaHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final t f214017a;

    public i(t tVar) {
        this.f214017a = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = this.f214017a;
        C32973d.f214012a.getClass();
        return new C43834a(PaymentSessionCpaLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PaymentSessionCpaLink.class), tVar));
    }
}
