package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatsItemTabFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f86549a;

    /* renamed from: b, reason: collision with root package name */
    public final g f86550b;

    /* renamed from: c, reason: collision with root package name */
    public final i f86551c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f86552d;

    public e(b bVar, g gVar, i iVar, Provider provider) {
        this.f86549a = bVar;
        this.f86550b = gVar;
        this.f86551c = iVar;
        this.f86552d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f86549a.get();
        this.f86550b.getClass();
        f fVar = new f();
        h hVar = (h) this.f86551c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f86552d.get();
        StatsItemTabState.f86562f.getClass();
        return new d("StatsItemTabMviFragment", StatsItemTabState.f86563g, new c(aVar, screenPerformanceTracker, hVar, fVar));
    }
}
