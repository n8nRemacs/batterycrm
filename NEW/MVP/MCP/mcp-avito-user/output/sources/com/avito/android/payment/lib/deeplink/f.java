package com.avito.android.payment.lib.deeplink;

import com.avito.android.deep_linking.links.PaymentSessionLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PaymentSessionDeepLinkHandlerModule_ProvidePaymentSessionHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f214583a;

    public f(g gVar) {
        this.f214583a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f214583a;
        d.f214581a.getClass();
        return new C43834a(PaymentSessionLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PaymentSessionLink.class), gVar));
    }
}
