package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailStatsMVIFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f86123a;

    /* renamed from: b, reason: collision with root package name */
    public final b f86124b;

    /* renamed from: c, reason: collision with root package name */
    public final i f86125c;

    /* renamed from: d, reason: collision with root package name */
    public final k f86126d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f86127e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f86123a = dVar;
        this.f86124b = bVar;
        this.f86125c = iVar;
        this.f86126d = kVar;
        this.f86127e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f86123a.get();
        a aVar = (a) this.f86124b.get();
        this.f86125c.getClass();
        h hVar = new h();
        j jVar = (j) this.f86126d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f86127e.get();
        AdvertDetailStatsMVIState.f86110k.getClass();
        return new f("AdvertDetailStatsMVI", AdvertDetailStatsMVIState.f86111l, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
