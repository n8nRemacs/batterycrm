package com.avito.android.advert_collection.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection.i> f81634a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.n> f81635b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.b> f81636c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.analytics.provider.f f81637d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection.l> f81638e;

    public g(Provider provider, Provider provider2, Provider provider3, com.avito.android.analytics.provider.f fVar, Provider provider4) {
        this.f81634a = provider;
        this.f81635b = provider2;
        this.f81636c = provider3;
        this.f81637d = fVar;
        this.f81638e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_collection.i iVar = this.f81634a.get();
        com.avito.android.favorite.n nVar = this.f81635b.get();
        com.avito.android.advert_collection_toast.b bVar = this.f81636c.get();
        this.f81637d.getClass();
        return new e(iVar, nVar, bVar, new com.avito.android.analytics.provider.e(), this.f81638e.get());
    }
}
