package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: ShortcutsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class U implements dagger.internal.h<C35609a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.plugin.rx.a> f313945a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f313946b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.d f313947c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f313948d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f313949e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f313950f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Z0> f313951g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f313952h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<s90.b> f313953i;

    public U(Provider provider, Provider provider2, com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.d dVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f313945a = provider;
        this.f313946b = provider2;
        this.f313947c = dVar;
        this.f313948d = provider3;
        this.f313949e = provider4;
        this.f313950f = provider5;
        this.f313951g = provider6;
        this.f313952h = provider7;
        this.f313953i = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35609a(this.f313945a.get(), this.f313946b.get(), (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.a) this.f313947c.get(), this.f313948d.get(), this.f313949e.get(), this.f313950f.get(), this.f313951g.get(), this.f313952h.get(), this.f313953i.get());
    }
}
