package com.avito.android.extended_profile_selection_create.image.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionImageFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f151791a;

    /* renamed from: b, reason: collision with root package name */
    public final f f151792b;

    /* renamed from: c, reason: collision with root package name */
    public final m f151793c;

    /* renamed from: d, reason: collision with root package name */
    public final o f151794d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f151795e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f151791a = hVar;
        this.f151792b = fVar;
        this.f151793c = mVar;
        this.f151794d = oVar;
        this.f151795e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f151791a.getClass();
        g gVar = new g();
        d dVar = (d) this.f151792b.get();
        this.f151793c.getClass();
        l lVar = new l();
        n nVar = (n) this.f151794d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f151795e.get();
        JA.c.f8836f.getClass();
        return new j("ExtendedProfileSetSelectionImage", JA.c.f8837g, new i(gVar, dVar, screenPerformanceTracker, nVar, lVar));
    }
}
