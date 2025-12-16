package com.avito.android.tariff_lf_publication.count.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationCountFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f300844a;

    /* renamed from: b, reason: collision with root package name */
    public final c f300845b;

    /* renamed from: c, reason: collision with root package name */
    public final j f300846c;

    /* renamed from: d, reason: collision with root package name */
    public final l f300847d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f300848e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f300844a = eVar;
        this.f300845b = cVar;
        this.f300846c = jVar;
        this.f300847d = lVar;
        this.f300848e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f300844a.get();
        b bVar = (b) this.f300845b.get();
        this.f300846c.getClass();
        i iVar = new i();
        k kVar = (k) this.f300847d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f300848e.get();
        MD0.c.f10471k.getClass();
        return new g("TariffLfPublicationCount", MD0.c.f10472l, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
