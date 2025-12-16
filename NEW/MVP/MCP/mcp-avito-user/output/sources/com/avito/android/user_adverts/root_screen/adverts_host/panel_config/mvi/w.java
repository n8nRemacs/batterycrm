package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: PanelConfigActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<C35593a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.plugin.rx.a> f313440a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f313441b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a> f313442c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i> f313443d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f313444e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f313445f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f313446g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f313447h;

    public w(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f313440a = provider;
        this.f313441b = provider2;
        this.f313442c = provider3;
        this.f313443d = provider4;
        this.f313444e = uVar;
        this.f313445f = provider5;
        this.f313446g = provider6;
        this.f313447h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35593a(this.f313440a.get(), this.f313441b.get(), this.f313442c.get(), this.f313443d.get(), (com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c) this.f313444e.get(), this.f313445f.get(), this.f313446g.get(), this.f313447h.get());
    }
}
