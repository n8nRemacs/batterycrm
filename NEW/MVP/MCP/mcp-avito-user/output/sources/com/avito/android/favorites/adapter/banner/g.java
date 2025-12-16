package com.avito.android.favorites.adapter.banner;

import com.avito.android.favorites.adapter.promo.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SalesPromoItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f156543a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.a> f156544b;

    public g(Provider<p> provider, Provider<com.avito.android.favorites.adapter.promo.a> provider2) {
        this.f156543a = provider;
        this.f156544b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f156543a.get(), this.f156544b.get());
    }
}
