package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutPvzDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f257185a;

    /* renamed from: b, reason: collision with root package name */
    public final l f257186b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f257187c;

    public n(l lVar, dv.b bVar, dv.b bVar2) {
        this.f257185a = bVar;
        this.f257186b = lVar;
        this.f257187c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((a.InterfaceC4053a) this.f257187c.get(), (a.b) this.f257185a.get(), (i) this.f257186b.get());
    }
}
