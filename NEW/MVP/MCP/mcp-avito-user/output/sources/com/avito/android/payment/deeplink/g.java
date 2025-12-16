package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentGenericLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentGenericHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f214015a;

    public g(n nVar) {
        this.f214015a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f214015a;
        C32973d.f214012a.getClass();
        return new C43834a(PaymentGenericLink.class, null, new C43834a.b.C11809b(nVar));
    }
}
