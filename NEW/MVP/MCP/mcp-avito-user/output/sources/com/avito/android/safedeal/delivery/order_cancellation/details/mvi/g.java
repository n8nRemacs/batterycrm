package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReasonDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f256256a;

    /* renamed from: b, reason: collision with root package name */
    public final b f256257b;

    /* renamed from: c, reason: collision with root package name */
    public final i f256258c;

    /* renamed from: d, reason: collision with root package name */
    public final k f256259d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f256260e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f256256a = dVar;
        this.f256257b = bVar;
        this.f256258c = iVar;
        this.f256259d = kVar;
        this.f256260e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f256256a.get();
        a aVar = (a) this.f256257b.get();
        this.f256258c.getClass();
        h hVar = new h();
        this.f256259d.getClass();
        j jVar = new j();
        return new f("ReasonDetails", new Dn0.c(null, null, null, 7, null), new e(cVar, aVar, this.f256260e.get(), jVar, hVar));
    }
}
