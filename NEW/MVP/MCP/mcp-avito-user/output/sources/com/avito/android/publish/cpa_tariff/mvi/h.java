package com.avito.android.publish.cpa_tariff.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaTariffFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f232482a;

    /* renamed from: b, reason: collision with root package name */
    public final e f232483b;

    public h(c cVar, e eVar) {
        this.f232482a = cVar;
        this.f232483b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f232482a.get();
        d dVar = (d) this.f232483b.get();
        Kd0.d.f9557d.getClass();
        return new g("CpaTariff", Kd0.d.f9558e, new f(bVar, dVar));
    }
}
