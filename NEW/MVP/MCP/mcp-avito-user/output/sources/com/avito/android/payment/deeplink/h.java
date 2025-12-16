package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentRedirectLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentRedirectHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final r f214016a;

    public h(r rVar) {
        this.f214016a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32973d.f214012a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PaymentRedirectLink.class, new C32970a(), new C43834a.b.C11809b(this.f214016a));
    }
}
