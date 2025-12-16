package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import cJ0.InterfaceC27047a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import nE.C44240b;

/* compiled from: UserAdvertsListActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class N implements dagger.internal.h<C35670a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.adverts.domain.a> f315244a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_actions.host.domain.f> f315245b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f315246c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<nI0.f> f315247d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f315248e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f315249f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a> f315250g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g> f315251h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C44240b> f315252i;

    public N(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f315244a = provider;
        this.f315245b = provider2;
        this.f315246c = provider3;
        this.f315247d = provider4;
        this.f315248e = uVar;
        this.f315249f = provider5;
        this.f315250g = provider6;
        this.f315251h = provider7;
        this.f315252i = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35670a(this.f315244a.get(), this.f315245b.get(), this.f315246c.get(), this.f315247d.get(), (InterfaceC27047a) this.f315248e.get(), this.f315249f.get(), this.f315250g.get(), this.f315251h.get(), this.f315252i.get());
    }
}
