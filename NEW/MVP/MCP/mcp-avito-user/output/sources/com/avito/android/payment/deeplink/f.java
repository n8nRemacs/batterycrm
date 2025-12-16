package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.PaymentGenericFormLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvidePaymentGenericFormHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f214014a;

    public f(p pVar) {
        this.f214014a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = this.f214014a;
        C32973d.f214012a.getClass();
        return new C43834a(PaymentGenericFormLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PaymentGenericFormLink.class), pVar));
    }
}
