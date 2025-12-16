package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: PanelSoaActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class C implements dagger.internal.h<C35597a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.plugin.rx.a> f313495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f313496b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.i> f313497c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f313498d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f313499e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f313500f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f313501g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.o f313502h;

    public C(Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4, Provider provider5, Provider provider6, com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.o oVar) {
        this.f313495a = provider;
        this.f313496b = provider2;
        this.f313497c = provider3;
        this.f313498d = uVar;
        this.f313499e = provider4;
        this.f313500f = provider5;
        this.f313501g = provider6;
        this.f313502h = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35597a(this.f313495a.get(), this.f313496b.get(), this.f313497c.get(), (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c) this.f313498d.get(), this.f313499e.get(), this.f313500f.get(), this.f313501g.get(), (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.l) this.f313502h.get());
    }
}
