package com.avito.android.favorite_sellers;

import com.avito.android.serp.adapter.n1;
import javax.inject.Provider;

/* compiled from: FavoriteSellerAdvertsStatusProcessorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorite_sellers.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30582f implements dagger.internal.h<C30581e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.T> f155888a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f155889b;

    public C30582f(dagger.internal.u uVar, Provider provider) {
        this.f155888a = provider;
        this.f155889b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30581e(this.f155888a.get(), (n1) this.f155889b.get());
    }
}
