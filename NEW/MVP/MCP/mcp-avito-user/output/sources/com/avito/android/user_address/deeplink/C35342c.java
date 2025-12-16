package com.avito.android.user_address.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: UserAddressAddNewRealtyAddressDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_address.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35342c implements dagger.internal.h<C35341b> {

    /* renamed from: a, reason: collision with root package name */
    public final m f307224a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f307225b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307226c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f307227d;

    public C35342c(m mVar, dv.b bVar, dv.b bVar2, C25721c c25721c) {
        this.f307224a = mVar;
        this.f307225b = bVar;
        this.f307226c = bVar2;
        this.f307227d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35341b((k) this.f307224a.get(), (a.InterfaceC4053a) this.f307225b.get(), (a.b) this.f307226c.get(), (C25719a) this.f307227d.get());
    }
}
