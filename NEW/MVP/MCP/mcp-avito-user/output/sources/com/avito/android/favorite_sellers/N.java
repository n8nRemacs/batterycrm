package com.avito.android.favorite_sellers;

import android.content.res.Resources;

/* compiled from: FavoriteSellersResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f155458a;

    public N(dagger.internal.l lVar) {
        this.f155458a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new M((Resources) this.f155458a.f393949a);
    }
}
