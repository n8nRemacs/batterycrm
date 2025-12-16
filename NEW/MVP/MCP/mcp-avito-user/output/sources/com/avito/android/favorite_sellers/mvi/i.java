package com.avito.android.favorite_sellers.mvi;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.favorite_sellers.InterfaceC30588l;
import com.avito.android.favorite_sellers.V;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteSellersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156064a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.common.a> f156065b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f156066c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f156067d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f156068e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<V> f156069f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f156070g;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f156064a = uVar;
        this.f156065b = provider;
        this.f156066c = provider2;
        this.f156067d = provider3;
        this.f156068e = provider4;
        this.f156069f = provider5;
        this.f156070g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC30588l) this.f156064a.get(), this.f156065b.get(), this.f156066c.get(), this.f156067d.get(), this.f156068e.get(), this.f156069f.get(), this.f156070g.get());
    }
}
