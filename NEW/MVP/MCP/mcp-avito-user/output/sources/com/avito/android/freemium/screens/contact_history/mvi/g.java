package com.avito.android.freemium.screens.contact_history.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FreemiumContactHistoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f158998a;

    /* renamed from: b, reason: collision with root package name */
    public final b f158999b;

    /* renamed from: c, reason: collision with root package name */
    public final i f159000c;

    /* renamed from: d, reason: collision with root package name */
    public final k f159001d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f159002e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f158998a = dVar;
        this.f158999b = bVar;
        this.f159000c = iVar;
        this.f159001d = kVar;
        this.f159002e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f158998a.get();
        a aVar = (a) this.f158999b.get();
        this.f159000c.getClass();
        h hVar = new h();
        this.f159001d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f159002e.get();
        dF.c.f393758g.getClass();
        return new f("FreemiumContactHistory", dF.c.f393759h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
