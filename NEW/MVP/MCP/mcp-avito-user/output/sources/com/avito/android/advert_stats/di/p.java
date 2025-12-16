package com.avito.android.advert_stats.di;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.advert_stats.di.y;
import com.avito.android.preloading.j;
import com.avito.android.util.C;
import com.avito.android.util.P2;
import javax.inject.Provider;
import kb.C42659a;

/* compiled from: AdvertStatsModule_ProvidePreloadingPromise$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<com.avito.android.preloading.j<String, P2<C42659a>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_stats.preloading.d> f86588a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f86589b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f86590c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f86591d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f86592e;

    public p(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f86588a = provider;
        this.f86589b = provider2;
        this.f86590c = provider3;
        this.f86591d = lVar;
        this.f86592e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_stats.preloading.d dVar = this.f86588a.get();
        C c12 = (C) ((y.b.d) this.f86589b).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroupY1 = ((y.b.g) this.f86590c).f86653a.Y1();
        String str = (String) this.f86591d.f393949a;
        boolean zBooleanValue = ((Boolean) this.f86592e.f393949a).booleanValue();
        e.f86574a.getClass();
        j.a aVar = com.avito.android.preloading.j.f221853g;
        boolean z12 = preloadingPromiseTestGroupY1.a() && zBooleanValue;
        aVar.getClass();
        return z12 ? new com.avito.android.preloading.a(str, dVar, c12) : new com.avito.android.preloading.b(dVar, c12);
    }
}
