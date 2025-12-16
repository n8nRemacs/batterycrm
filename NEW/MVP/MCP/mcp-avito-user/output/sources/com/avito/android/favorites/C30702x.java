package com.avito.android.favorites;

import bD.InterfaceC25497b;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorites.di.C30653k;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsListInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30702x implements dagger.internal.h<C30700w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V> f157582a;

    /* renamed from: b, reason: collision with root package name */
    public final C30653k f157583b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ZC.c> f157584c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f157585d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.D> f157586e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f157587f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f157588g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f157589h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC30603b> f157590i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f157591j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.preloading.j<kotlin.G0, FavoriteItemsWidgets>> f157592k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f157593l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f157594m;

    public C30702x(Provider provider, C30653k c30653k, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f157582a = provider;
        this.f157583b = c30653k;
        this.f157584c = provider2;
        this.f157585d = provider3;
        this.f157586e = provider4;
        this.f157587f = provider5;
        this.f157588g = provider6;
        this.f157589h = provider7;
        this.f157590i = provider8;
        this.f157591j = provider9;
        this.f157592k = provider10;
        this.f157593l = lVar;
        this.f157594m = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30700w(this.f157582a.get(), (com.avito.android.account.W) this.f157583b.get(), this.f157584c.get(), this.f157585d.get(), this.f157586e.get(), this.f157587f.get(), this.f157588g.get(), this.f157589h.get(), this.f157590i.get(), this.f157591j.get(), this.f157592k.get(), (FavoritesSpace) this.f157593l.f393949a, (InterfaceC25497b) this.f157594m.get());
    }
}
