package com.avito.android.freemium.screens.rules.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import eF.C39999c;
import javax.inject.Provider;

/* compiled from: FreemiumRulesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f159143a;

    /* renamed from: b, reason: collision with root package name */
    public final b f159144b;

    /* renamed from: c, reason: collision with root package name */
    public final i f159145c;

    /* renamed from: d, reason: collision with root package name */
    public final k f159146d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f159147e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f159143a = dVar;
        this.f159144b = bVar;
        this.f159145c = iVar;
        this.f159146d = kVar;
        this.f159147e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f159143a.get();
        a aVar = (a) this.f159144b.get();
        this.f159145c.getClass();
        h hVar = new h();
        this.f159146d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f159147e.get();
        C39999c.f395069g.getClass();
        return new f("FreemiumRules", C39999c.f395070h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
