package com.avito.android.tariff_select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffSelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301243a;

    /* renamed from: b, reason: collision with root package name */
    public final d f301244b;

    /* renamed from: c, reason: collision with root package name */
    public final k f301245c;

    /* renamed from: d, reason: collision with root package name */
    public final m f301246d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f301247e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f301243a = fVar;
        this.f301244b = dVar;
        this.f301245c = kVar;
        this.f301246d = mVar;
        this.f301247e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f301243a.get();
        c cVar = (c) this.f301244b.get();
        this.f301245c.getClass();
        j jVar = new j();
        l lVar = (l) this.f301246d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f301247e.get();
        ZD0.c.f19993f.getClass();
        return new h("TariffSelect", ZD0.c.f19994g, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
