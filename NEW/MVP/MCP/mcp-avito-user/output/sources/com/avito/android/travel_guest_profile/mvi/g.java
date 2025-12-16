package com.avito.android.travel_guest_profile.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelGuestProfileFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f302191a;

    /* renamed from: b, reason: collision with root package name */
    public final b f302192b;

    /* renamed from: c, reason: collision with root package name */
    public final i f302193c;

    /* renamed from: d, reason: collision with root package name */
    public final k f302194d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f302195e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f302191a = dVar;
        this.f302192b = bVar;
        this.f302193c = iVar;
        this.f302194d = kVar;
        this.f302195e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f302191a.get();
        a aVar = (a) this.f302192b.get();
        this.f302193c.getClass();
        h hVar = new h();
        j jVar = (j) this.f302194d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f302195e.get();
        QE0.d.f13620k.getClass();
        return new f("TravelGuestProfile", QE0.d.f13621l, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
