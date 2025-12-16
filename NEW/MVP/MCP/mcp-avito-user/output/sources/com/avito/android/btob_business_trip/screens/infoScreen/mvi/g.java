package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zk.C50579c;

/* compiled from: B2bBusinessTripInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f108009a;

    /* renamed from: b, reason: collision with root package name */
    public final b f108010b;

    /* renamed from: c, reason: collision with root package name */
    public final i f108011c;

    /* renamed from: d, reason: collision with root package name */
    public final k f108012d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f108013e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f108009a = dVar;
        this.f108010b = bVar;
        this.f108011c = iVar;
        this.f108012d = kVar;
        this.f108013e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f108009a.get();
        a aVar = (a) this.f108010b.get();
        this.f108011c.getClass();
        h hVar = new h();
        this.f108012d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f108013e.get();
        C50579c.f444201e.getClass();
        return new f("B2bBusinessTripOnboarding", C50579c.f444202f, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
