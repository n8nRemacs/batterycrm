package com.avito.android.bbl.screens.contact_history.mvi;

import Dh.C13399c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblContactHistoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f99681a;

    /* renamed from: b, reason: collision with root package name */
    public final b f99682b;

    /* renamed from: c, reason: collision with root package name */
    public final i f99683c;

    /* renamed from: d, reason: collision with root package name */
    public final k f99684d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99685e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f99681a = dVar;
        this.f99682b = bVar;
        this.f99683c = iVar;
        this.f99684d = kVar;
        this.f99685e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f99681a.get();
        a aVar = (a) this.f99682b.get();
        this.f99683c.getClass();
        h hVar = new h();
        this.f99684d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99685e.get();
        C13399c.f3358g.getClass();
        return new f("BblContactHistory", C13399c.f3359h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
