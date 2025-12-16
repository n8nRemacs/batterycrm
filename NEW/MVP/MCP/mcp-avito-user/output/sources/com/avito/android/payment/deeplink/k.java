package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentStatusLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentStatusHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f214019a;

    public k(v vVar) {
        this.f214019a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = this.f214019a;
        C32973d.f214012a.getClass();
        return new C43834a(PaymentStatusLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PaymentStatusLink.class), vVar));
    }
}
