package com.avito.android.job.cv_info_actualization.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f174183a;

    /* renamed from: b, reason: collision with root package name */
    public final o f174184b;

    /* renamed from: c, reason: collision with root package name */
    public final m f174185c;

    /* renamed from: d, reason: collision with root package name */
    public final f f174186d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f174187e;

    public k(h hVar, o oVar, m mVar, f fVar, Provider provider) {
        this.f174183a = hVar;
        this.f174184b = oVar;
        this.f174185c = mVar;
        this.f174186d = fVar;
        this.f174187e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f174183a.get();
        this.f174184b.getClass();
        n nVar = new n();
        l lVar = (l) this.f174185c.get();
        return new j("JsxCvInfoActualizationScreen", new TP.d(null, false, false, false, 15, null), new i(gVar, (e) this.f174186d.get(), this.f174187e.get(), nVar, lVar));
    }
}
