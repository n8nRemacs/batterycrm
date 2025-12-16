package com.avito.android.bbl.screens.limit_increase.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LimitIncreaseFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f99805a;

    /* renamed from: b, reason: collision with root package name */
    public final b f99806b;

    /* renamed from: c, reason: collision with root package name */
    public final i f99807c;

    /* renamed from: d, reason: collision with root package name */
    public final k f99808d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99809e;

    /* renamed from: f, reason: collision with root package name */
    public final l f99810f;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider, l lVar) {
        this.f99805a = dVar;
        this.f99806b = bVar;
        this.f99807c = iVar;
        this.f99808d = kVar;
        this.f99809e = provider;
        this.f99810f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f99805a.get();
        a aVar = (a) this.f99806b.get();
        this.f99807c.getClass();
        h hVar = new h();
        this.f99808d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99809e.get();
        boolean zBooleanValue = ((Boolean) this.f99810f.f393949a).booleanValue();
        Eh.c.f4174n.getClass();
        return new f("LimitIncrease", Eh.c.a(Eh.c.f4175o, zBooleanValue, false, null, null, null, null, null, null, null, null, null, false, 4094), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
