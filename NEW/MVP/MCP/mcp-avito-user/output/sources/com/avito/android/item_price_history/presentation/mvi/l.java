package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryScreen;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final e f173840a;

    /* renamed from: b, reason: collision with root package name */
    public final i f173841b;

    /* renamed from: c, reason: collision with root package name */
    public final n f173842c;

    /* renamed from: d, reason: collision with root package name */
    public final p f173843d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f173844e;

    public l(e eVar, i iVar, n nVar, p pVar, Provider provider) {
        this.f173840a = eVar;
        this.f173841b = iVar;
        this.f173842c = nVar;
        this.f173843d = pVar;
        this.f173844e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f173840a.get();
        h hVar = (h) this.f173841b.get();
        this.f173842c.getClass();
        m mVar = new m();
        o oVar = (o) this.f173843d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f173844e.get();
        EO.c.f4001f.getClass();
        return new k(ItemPriceHistoryScreen.f173719d.f90471b, EO.c.f4002g, new j(cVar, hVar, screenPerformanceTracker, oVar, mVar));
    }
}
