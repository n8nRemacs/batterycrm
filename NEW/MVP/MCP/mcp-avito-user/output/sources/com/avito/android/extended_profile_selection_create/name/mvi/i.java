package com.avito.android.extended_profile_selection_create.name.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionNameFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f151920a;

    /* renamed from: b, reason: collision with root package name */
    public final d f151921b;

    /* renamed from: c, reason: collision with root package name */
    public final k f151922c;

    /* renamed from: d, reason: collision with root package name */
    public final m f151923d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f151924e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f151920a = fVar;
        this.f151921b = dVar;
        this.f151922c = kVar;
        this.f151923d = mVar;
        this.f151924e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f151920a.getClass();
        e eVar = new e();
        c cVar = (c) this.f151921b.get();
        j jVar = (j) this.f151922c.get();
        l lVar = (l) this.f151923d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f151924e.get();
        KA.c.f9343h.getClass();
        return new h("ExtendedProfileSetSelectionName", KA.c.f9344i, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
