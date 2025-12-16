package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoSfTermsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f296913a;

    /* renamed from: b, reason: collision with root package name */
    public final b f296914b;

    /* renamed from: c, reason: collision with root package name */
    public final i f296915c;

    /* renamed from: d, reason: collision with root package name */
    public final k f296916d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296917e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f296913a = dVar;
        this.f296914b = bVar;
        this.f296915c = iVar;
        this.f296916d = kVar;
        this.f296917e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f296913a.get();
        a aVar = (a) this.f296914b.get();
        this.f296915c.getClass();
        h hVar = new h();
        this.f296916d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296917e.get();
        BB0.c.f1235f.getClass();
        return new f("TariffCpxInfoSfTerms", BB0.c.f1236g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
