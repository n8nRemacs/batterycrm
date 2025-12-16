package com.avito.android.user_address.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: UserAddressListDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307191a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307192b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307193c;

    public A(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307191a = bVar;
        this.f307192b = mVar;
        this.f307193c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((a.b) this.f307191a.get(), (k) this.f307192b.get(), (a.InterfaceC4053a) this.f307193c.get());
    }
}
