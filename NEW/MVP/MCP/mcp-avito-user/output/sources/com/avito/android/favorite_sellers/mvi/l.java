package com.avito.android.favorite_sellers.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteSellersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f156075a;

    /* renamed from: b, reason: collision with root package name */
    public final n f156076b;

    /* renamed from: c, reason: collision with root package name */
    public final p f156077c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f156078d;

    public l(i iVar, n nVar, p pVar, Provider provider) {
        this.f156075a = iVar;
        this.f156076b = nVar;
        this.f156077c = pVar;
        this.f156078d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f156075a.get();
        this.f156076b.getClass();
        m mVar = new m();
        o oVar = (o) this.f156077c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f156078d.get();
        FavoriteSellersState.f156035r.getClass();
        return new k("FavoriteSellers", FavoriteSellersState.f156036s, new j(aVar, screenPerformanceTracker, oVar, mVar));
    }
}
