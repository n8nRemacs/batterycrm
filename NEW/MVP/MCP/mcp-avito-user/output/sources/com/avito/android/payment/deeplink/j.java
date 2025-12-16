package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentStatusFormLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentStatusFormHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final x f214018a;

    public j(x xVar) {
        this.f214018a = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        x xVar = this.f214018a;
        C32973d.f214012a.getClass();
        return new C43834a(PaymentStatusFormLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PaymentStatusFormLink.class), xVar));
    }
}
