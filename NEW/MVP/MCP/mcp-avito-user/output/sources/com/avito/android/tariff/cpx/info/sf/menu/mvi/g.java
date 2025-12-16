package com.avito.android.tariff.cpx.info.sf.menu.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zB0.C50434c;

/* compiled from: TariffCpxInfoSfMenuFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f296806a;

    /* renamed from: b, reason: collision with root package name */
    public final b f296807b;

    /* renamed from: c, reason: collision with root package name */
    public final i f296808c;

    /* renamed from: d, reason: collision with root package name */
    public final k f296809d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296810e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f296806a = dVar;
        this.f296807b = bVar;
        this.f296808c = iVar;
        this.f296809d = kVar;
        this.f296810e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f296806a.get();
        this.f296807b.getClass();
        a aVar = new a();
        this.f296808c.getClass();
        h hVar = new h();
        this.f296809d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296810e.get();
        C50434c.f443946c.getClass();
        return new f("TariffCpxInfoSfMenu", C50434c.f443947d, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
