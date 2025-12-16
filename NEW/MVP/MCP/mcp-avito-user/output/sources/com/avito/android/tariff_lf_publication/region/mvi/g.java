package com.avito.android.tariff_lf_publication.region.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationRegionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f301111a;

    /* renamed from: b, reason: collision with root package name */
    public final b f301112b;

    /* renamed from: c, reason: collision with root package name */
    public final i f301113c;

    /* renamed from: d, reason: collision with root package name */
    public final k f301114d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f301115e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f301111a = dVar;
        this.f301112b = bVar;
        this.f301113c = iVar;
        this.f301114d = kVar;
        this.f301115e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f301111a.get();
        a aVar = (a) this.f301112b.get();
        this.f301113c.getClass();
        h hVar = new h();
        j jVar = (j) this.f301114d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f301115e.get();
        VD0.c.f17018h.getClass();
        return new f("TariffLfPublicationRegion", VD0.c.f17019i, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
