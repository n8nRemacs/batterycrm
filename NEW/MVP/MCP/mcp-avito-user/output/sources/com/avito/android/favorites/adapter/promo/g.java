package com.avito.android.favorites.adapter.promo;

import javax.inject.Provider;

/* compiled from: FavoritesPromoItemBlueprintImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f156660a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f156661b;

    public g(dagger.internal.u uVar, Provider provider) {
        this.f156660a = provider;
        this.f156661b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f156660a.get(), (x) this.f156661b.get());
    }
}
