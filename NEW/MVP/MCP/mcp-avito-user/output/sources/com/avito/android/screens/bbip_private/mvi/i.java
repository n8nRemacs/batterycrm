package com.avito.android.screens.bbip_private.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rp0.C47707c;

/* compiled from: BbipPrivateFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f260615a;

    /* renamed from: b, reason: collision with root package name */
    public final d f260616b;

    /* renamed from: c, reason: collision with root package name */
    public final k f260617c;

    /* renamed from: d, reason: collision with root package name */
    public final m f260618d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f260619e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f260615a = fVar;
        this.f260616b = dVar;
        this.f260617c = kVar;
        this.f260618d = mVar;
        this.f260619e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f260615a.get();
        a aVar = (a) this.f260616b.get();
        this.f260617c.getClass();
        j jVar = new j();
        l lVar = (l) this.f260618d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f260619e.get();
        C47707c.f430245o.getClass();
        return new h("BbipPrivate", C47707c.f430246p, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
