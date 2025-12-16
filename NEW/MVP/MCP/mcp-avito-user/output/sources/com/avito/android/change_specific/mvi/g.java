package com.avito.android.change_specific.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lo.C43810c;

/* compiled from: ExtendedProfileChangeSpecificFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f118034a;

    /* renamed from: b, reason: collision with root package name */
    public final b f118035b;

    /* renamed from: c, reason: collision with root package name */
    public final i f118036c;

    /* renamed from: d, reason: collision with root package name */
    public final k f118037d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f118038e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f118034a = dVar;
        this.f118035b = bVar;
        this.f118036c = iVar;
        this.f118037d = kVar;
        this.f118038e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f118034a.get();
        a aVar = (a) this.f118035b.get();
        this.f118036c.getClass();
        h hVar = new h();
        j jVar = (j) this.f118037d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f118038e.get();
        C43810c.f414205i.getClass();
        return new f("ExtendedProfileChangeSpecific", C43810c.f414206j, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
