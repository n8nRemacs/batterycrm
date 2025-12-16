package com.avito.android.payment.lib.deeplink;

import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PaymentSessionDeepLinkHandlerModule_ProvideLegacyPaymentSessionHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f214582a;

    public e(b bVar) {
        this.f214582a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f214582a;
        d.f214581a.getClass();
        return new C43834a(LegacyPaymentSessionLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LegacyPaymentSessionLink.class), bVar));
    }
}
