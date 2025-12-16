package com.avito.android.advert_stats.detail.di;

import com.avito.android.util.P2;
import javax.inject.Provider;
import kb.C42659a;

/* compiled from: AdvertDetailStatsModule_ProvidePreloadingPromise$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28301b implements dagger.internal.h<com.avito.android.preloading.j<String, P2<C42659a>>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86136a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f86137b;

    public C28301b(dagger.internal.u uVar, Provider provider) {
        this.f86136a = uVar;
        this.f86137b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.preloading.d dVar = (com.avito.android.advert_stats.preloading.d) this.f86136a.get();
        com.avito.android.util.C c12 = this.f86137b.get();
        C28300a.f86135a.getClass();
        com.avito.android.preloading.j.f221853g.getClass();
        return new com.avito.android.preloading.b(dVar, c12);
    }
}
