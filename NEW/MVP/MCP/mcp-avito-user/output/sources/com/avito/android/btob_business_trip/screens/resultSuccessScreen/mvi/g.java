package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import Ak.C13046c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: B2bBusinessTripSuccessScreenFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f108109a;

    /* renamed from: b, reason: collision with root package name */
    public final b f108110b;

    /* renamed from: c, reason: collision with root package name */
    public final i f108111c;

    /* renamed from: d, reason: collision with root package name */
    public final k f108112d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f108113e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f108109a = dVar;
        this.f108110b = bVar;
        this.f108111c = iVar;
        this.f108112d = kVar;
        this.f108113e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f108109a.get();
        a aVar = (a) this.f108110b.get();
        this.f108111c.getClass();
        h hVar = new h();
        this.f108112d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f108113e.get();
        C13046c.f597d.getClass();
        return new f("B2bBusinessTripSuccessScreen", C13046c.f598e, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
