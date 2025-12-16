package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: B2bBusinessTripSelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f108221a;

    /* renamed from: b, reason: collision with root package name */
    public final b f108222b;

    /* renamed from: c, reason: collision with root package name */
    public final i f108223c;

    /* renamed from: d, reason: collision with root package name */
    public final k f108224d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f108225e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f108221a = dVar;
        this.f108222b = bVar;
        this.f108223c = iVar;
        this.f108224d = kVar;
        this.f108225e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f108221a.get();
        a aVar = (a) this.f108222b.get();
        this.f108223c.getClass();
        h hVar = new h();
        j jVar = (j) this.f108224d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f108225e.get();
        Bk.c.f1651h.getClass();
        return new f("B2bBusinessTripSelect", Bk.c.f1652i, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
