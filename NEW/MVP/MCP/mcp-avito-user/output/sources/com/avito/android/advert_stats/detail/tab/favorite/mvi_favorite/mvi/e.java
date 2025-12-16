package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi;

import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MviFavoriteFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f86228a;

    /* renamed from: b, reason: collision with root package name */
    public final g f86229b;

    /* renamed from: c, reason: collision with root package name */
    public final i f86230c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f86231d;

    public e(b bVar, g gVar, i iVar, Provider provider) {
        this.f86228a = bVar;
        this.f86229b = gVar;
        this.f86230c = iVar;
        this.f86231d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f86228a.getClass();
        a aVar = new a();
        this.f86229b.getClass();
        f fVar = new f();
        this.f86230c.getClass();
        h hVar = new h();
        ScreenPerformanceTracker screenPerformanceTracker = this.f86231d.get();
        MviFavoriteState.f86234f.getClass();
        return new d("StatsFavorite", MviFavoriteState.f86235g, new c(aVar, screenPerformanceTracker, hVar, fVar));
    }
}
