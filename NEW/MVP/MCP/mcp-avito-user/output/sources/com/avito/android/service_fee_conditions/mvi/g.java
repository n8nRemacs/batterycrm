package com.avito.android.service_fee_conditions.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceFeeConditionsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f278454a;

    /* renamed from: b, reason: collision with root package name */
    public final b f278455b;

    /* renamed from: c, reason: collision with root package name */
    public final i f278456c;

    /* renamed from: d, reason: collision with root package name */
    public final o f278457d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f278458e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f278459f;

    public g(d dVar, b bVar, i iVar, o oVar, Provider provider, dagger.internal.l lVar) {
        this.f278454a = dVar;
        this.f278455b = bVar;
        this.f278456c = iVar;
        this.f278457d = oVar;
        this.f278458e = provider;
        this.f278459f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        int i12;
        c cVar = (c) this.f278454a.get();
        a aVar = (a) this.f278455b.get();
        this.f278456c.getClass();
        h hVar = new h();
        this.f278457d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f278458e.get();
        boolean zBooleanValue = ((Boolean) this.f278459f.f393949a).booleanValue();
        qu0.c.f429476m.getClass();
        qu0.c cVar2 = qu0.c.f429477n;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        if (zBooleanValue) {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            i12 = com.akita.compose.theme.re23.e.f64237O3;
        } else {
            com.akita.compose.theme.re23.b.f63985c.getClass();
            i12 = com.akita.compose.theme.re23.e.f64233O;
        }
        return new f("ServiceFeeConditions", qu0.c.a(cVar2, zBooleanValue, false, null, i12, null, null, null, null, null, null, null, 2038), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
