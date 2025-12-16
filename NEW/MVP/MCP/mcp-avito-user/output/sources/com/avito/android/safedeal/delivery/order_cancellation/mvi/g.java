package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsOrderCancellationReasonsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f256390a;

    /* renamed from: b, reason: collision with root package name */
    public final b f256391b;

    /* renamed from: c, reason: collision with root package name */
    public final i f256392c;

    /* renamed from: d, reason: collision with root package name */
    public final k f256393d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f256394e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f256390a = dVar;
        this.f256391b = bVar;
        this.f256392c = iVar;
        this.f256393d = kVar;
        this.f256394e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f256390a.get();
        a aVar = (a) this.f256391b.get();
        this.f256392c.getClass();
        h hVar = new h();
        this.f256393d.getClass();
        j jVar = new j();
        return new f("RdsOrderCancellationReasons", new Hn0.c(null, 1, null), new e(cVar, aVar, this.f256394e.get(), jVar, hVar));
    }
}
