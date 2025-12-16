package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f158296a;

    /* renamed from: b, reason: collision with root package name */
    public final f f158297b;

    /* renamed from: c, reason: collision with root package name */
    public final d f158298c;

    /* renamed from: d, reason: collision with root package name */
    public final k f158299d;

    /* renamed from: e, reason: collision with root package name */
    public final m f158300e;

    /* renamed from: f, reason: collision with root package name */
    public final u f158301f;

    public i(dagger.internal.l lVar, f fVar, d dVar, k kVar, m mVar, u uVar) {
        this.f158296a = lVar;
        this.f158297b = fVar;
        this.f158298c = dVar;
        this.f158299d = kVar;
        this.f158300e = mVar;
        this.f158301f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f158296a.f393949a).booleanValue();
        e eVar = (e) this.f158297b.get();
        a aVar = (a) this.f158298c.get();
        j jVar = (j) this.f158299d.get();
        l lVar = (l) this.f158300e.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f158301f.get();
        GE.c.f6389g.getClass();
        return new h("FeesMethodsV2", GE.c.a(GE.c.f6390h, null, zBooleanValue, null, null, false, 29), new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
