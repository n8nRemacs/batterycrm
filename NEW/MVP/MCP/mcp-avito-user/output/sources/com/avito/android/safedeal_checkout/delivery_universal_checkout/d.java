package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutCourierDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256965a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f256966b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256967c;

    public d(l lVar, dv.b bVar, dv.b bVar2) {
        this.f256965a = lVar;
        this.f256966b = bVar;
        this.f256967c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f256966b.get(), (a.b) this.f256967c.get(), (i) this.f256965a.get());
    }
}
