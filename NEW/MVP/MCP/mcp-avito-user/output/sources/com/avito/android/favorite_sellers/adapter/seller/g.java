package com.avito.android.favorite_sellers.adapter.seller;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SellerItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<vC.b>> f155762a;

    /* renamed from: b, reason: collision with root package name */
    public final I30.b f155763b;

    public g(Provider provider, I30.b bVar) {
        this.f155762a = provider;
        this.f155763b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f155762a.get(), (I30.d) this.f155763b.get());
    }
}
