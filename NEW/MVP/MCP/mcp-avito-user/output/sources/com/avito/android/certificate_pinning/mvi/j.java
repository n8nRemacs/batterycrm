package com.avito.android.certificate_pinning.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UnsafeNetworkFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f117836a;

    /* renamed from: b, reason: collision with root package name */
    public final e f117837b;

    /* renamed from: c, reason: collision with root package name */
    public final l f117838c;

    /* renamed from: d, reason: collision with root package name */
    public final n f117839d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f117840e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f117836a = gVar;
        this.f117837b = eVar;
        this.f117838c = lVar;
        this.f117839d = nVar;
        this.f117840e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f117836a.get();
        d dVar = (d) this.f117837b.get();
        k kVar = (k) this.f117838c.get();
        this.f117839d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f117840e.get();
        UnsafeNetworkState.f117814f.getClass();
        return new i("UnsafeNetwork", UnsafeNetworkState.f117815g, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
