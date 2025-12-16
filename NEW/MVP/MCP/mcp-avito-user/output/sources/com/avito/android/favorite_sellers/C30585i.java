package com.avito.android.favorite_sellers;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.n1;
import javax.inject.Provider;

/* compiled from: FavoriteSellersConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorite_sellers.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30585i implements dagger.internal.h<C30584h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f155893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.T> f155894b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n1> f155895c;

    public C30585i(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f155893a = uVar;
        this.f155894b = provider;
        this.f155895c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30584h((InterfaceC34904z0) this.f155893a.get(), this.f155894b.get(), this.f155895c.get());
    }
}
