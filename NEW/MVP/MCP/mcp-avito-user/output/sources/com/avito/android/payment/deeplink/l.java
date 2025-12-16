package com.avito.android.payment.deeplink;

import com.avito.android.deep_linking.links.SBOLPaymentLink;
import lv.C43834a;

/* compiled from: PaymentDeepLinkHandlerModule_ProvideSBOLPaymentHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final z f214020a;

    public l(z zVar) {
        this.f214020a = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = this.f214020a;
        C32973d.f214012a.getClass();
        return new C43834a(SBOLPaymentLink.class, null, new C43834a.b.C11809b(zVar));
    }
}
