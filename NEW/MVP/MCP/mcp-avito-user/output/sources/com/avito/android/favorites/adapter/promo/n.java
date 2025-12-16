package com.avito.android.favorites.adapter.promo;

import javax.inject.Provider;

/* compiled from: FavoritesPromoItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f156665a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f156666b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f156667c;

    public n(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f156665a = provider;
        this.f156666b = provider2;
        this.f156667c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f156666b.get(), this.f156665a.get(), (com.avito.android.lib.util.groupable_item.b) this.f156667c.get());
    }
}
