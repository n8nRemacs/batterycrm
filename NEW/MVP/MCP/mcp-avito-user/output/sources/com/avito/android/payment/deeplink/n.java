package com.avito.android.payment.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PaymentGenericDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214023a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214024b;

    public n(dv.b bVar, C36167y1 c36167y1) {
        this.f214023a = bVar;
        this.f214024b = c36167y1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((a.InterfaceC4053a) this.f214023a.get(), (InterfaceC36134w1) this.f214024b.get());
    }
}
