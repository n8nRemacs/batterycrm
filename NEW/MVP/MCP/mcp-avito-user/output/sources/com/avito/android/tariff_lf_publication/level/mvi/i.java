package com.avito.android.tariff_lf_publication.level.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationLevelFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f300939a;

    /* renamed from: b, reason: collision with root package name */
    public final d f300940b;

    /* renamed from: c, reason: collision with root package name */
    public final k f300941c;

    /* renamed from: d, reason: collision with root package name */
    public final m f300942d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f300943e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f300939a = fVar;
        this.f300940b = dVar;
        this.f300941c = kVar;
        this.f300942d = mVar;
        this.f300943e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f300939a.get();
        c cVar = (c) this.f300940b.get();
        this.f300941c.getClass();
        j jVar = new j();
        this.f300942d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f300943e.get();
        UD0.c.f16276j.getClass();
        return new h("TariffLfPublicationLevel", UD0.c.f16277k, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
