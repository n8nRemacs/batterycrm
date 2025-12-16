package com.avito.android.user_address.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: UserAddressMapDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307201a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307202b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307203c;

    public D(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307201a = bVar;
        this.f307202b = mVar;
        this.f307203c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((a.b) this.f307201a.get(), (k) this.f307202b.get(), (a.InterfaceC4053a) this.f307203c.get());
    }
}
