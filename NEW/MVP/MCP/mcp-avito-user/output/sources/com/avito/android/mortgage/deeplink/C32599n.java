package com.avito.android.mortgage.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import t00.InterfaceC48454a;

/* compiled from: MortgageApplicationsListDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.deeplink.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32599n implements dagger.internal.h<C32596k> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198876a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198877b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.deeplink.domain.k f198878c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f198879d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f198880e;

    /* renamed from: f, reason: collision with root package name */
    public final C25721c f198881f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f198882g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f198883h;

    public C32599n(dv.b bVar, t00.c cVar, com.avito.android.mortgage.deeplink.domain.k kVar, dv.b bVar2, dv.b bVar3, C25721c c25721c, dagger.internal.f fVar, Provider provider) {
        this.f198876a = bVar;
        this.f198877b = cVar;
        this.f198878c = kVar;
        this.f198879d = bVar2;
        this.f198880e = bVar3;
        this.f198881f = c25721c;
        this.f198882g = fVar;
        this.f198883h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32596k((a.InterfaceC4053a) this.f198876a.get(), (InterfaceC48454a) this.f198877b.get(), (com.avito.android.mortgage.deeplink.domain.i) this.f198878c.get(), (a.g) this.f198879d.get(), (a.i) this.f198880e.get(), (C25719a) this.f198881f.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f198882g.get(), this.f198883h.get());
    }
}
