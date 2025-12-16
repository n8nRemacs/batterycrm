package com.avito.android.vas_discount.v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasDiscountV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f319817a;

    /* renamed from: b, reason: collision with root package name */
    public final b f319818b;

    /* renamed from: c, reason: collision with root package name */
    public final i f319819c;

    /* renamed from: d, reason: collision with root package name */
    public final k f319820d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f319821e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f319817a = dVar;
        this.f319818b = bVar;
        this.f319819c = iVar;
        this.f319820d = kVar;
        this.f319821e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f319817a.get();
        a aVar = (a) this.f319818b.get();
        this.f319819c.getClass();
        h hVar = new h();
        j jVar = (j) this.f319820d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f319821e.get();
        qL0.c.f429200e.getClass();
        return new f("VasDiscountV2", qL0.c.f429201f, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
