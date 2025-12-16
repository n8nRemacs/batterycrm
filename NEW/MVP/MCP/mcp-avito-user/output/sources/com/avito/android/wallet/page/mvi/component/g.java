package com.avito.android.wallet.page.mvi.component;

import com.avito.android.InterfaceC36134w1;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPageActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f328140a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f328141b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.wallet.page.mvi.b f328142c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328143d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC36134w1> f328144e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.wallet.page.c> f328145f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.ui.universal.h> f328146g;

    public g(Provider provider, Provider provider2, com.avito.android.wallet.page.mvi.b bVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f328140a = provider;
        this.f328141b = provider2;
        this.f328142c = bVar;
        this.f328143d = provider3;
        this.f328144e = provider4;
        this.f328145f = provider5;
        this.f328146g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f328140a.get(), this.f328141b.get(), (com.avito.android.wallet.page.mvi.a) this.f328142c.get(), this.f328143d.get(), this.f328144e.get(), this.f328145f.get(), this.f328146g.get());
    }
}
