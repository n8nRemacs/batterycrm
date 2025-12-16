package com.avito.android.mortgage.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import t00.InterfaceC48454a;

/* compiled from: MortgageApplicationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32589d implements dagger.internal.h<C32588c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198799a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198800b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.deeplink.domain.b f198801c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f198802d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f198803e;

    /* renamed from: f, reason: collision with root package name */
    public final C25721c f198804f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f198805g;

    public C32589d(dv.b bVar, t00.c cVar, com.avito.android.mortgage.deeplink.domain.b bVar2, dv.b bVar3, dv.b bVar4, C25721c c25721c, Provider provider) {
        this.f198799a = bVar;
        this.f198800b = cVar;
        this.f198801c = bVar2;
        this.f198802d = bVar3;
        this.f198803e = bVar4;
        this.f198804f = c25721c;
        this.f198805g = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32588c((a.InterfaceC4053a) this.f198799a.get(), (InterfaceC48454a) this.f198800b.get(), (com.avito.android.mortgage.deeplink.domain.a) this.f198801c.get(), (a.g) this.f198802d.get(), (a.i) this.f198803e.get(), (C25719a) this.f198804f.get(), this.f198805g.get());
    }
}
