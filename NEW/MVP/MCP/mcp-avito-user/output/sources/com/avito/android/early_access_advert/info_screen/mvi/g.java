package com.avito.android.early_access_advert.info_screen.mvi;

import com.avito.android.analytics.screens.EarlyAccessAdvertInfoScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145743a;

    /* renamed from: b, reason: collision with root package name */
    public final b f145744b;

    /* renamed from: c, reason: collision with root package name */
    public final i f145745c;

    /* renamed from: d, reason: collision with root package name */
    public final k f145746d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f145747e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f145743a = dVar;
        this.f145744b = bVar;
        this.f145745c = iVar;
        this.f145746d = kVar;
        this.f145747e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f145743a.get();
        a aVar = (a) this.f145744b.get();
        this.f145745c.getClass();
        h hVar = new h();
        this.f145746d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f145747e.get();
        Vx.c.f17520d.getClass();
        return new f(EarlyAccessAdvertInfoScreen.f90346d.f90471b, Vx.c.f17521e, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
