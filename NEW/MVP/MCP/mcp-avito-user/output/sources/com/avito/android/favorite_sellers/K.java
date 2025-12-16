package com.avito.android.favorite_sellers;

import kotlinx.coroutines.flow.i2;

/* compiled from: FavoriteSellersMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite_sellers.mvi.l f155456a;

    public K(com.avito.android.favorite_sellers.mvi.l lVar) {
        this.f155456a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite_sellers.mvi.k kVar = (com.avito.android.favorite_sellers.mvi.k) this.f155456a.get();
        i2.f411430a.getClass();
        return new J(kVar, i2.a.f411433c);
    }
}
