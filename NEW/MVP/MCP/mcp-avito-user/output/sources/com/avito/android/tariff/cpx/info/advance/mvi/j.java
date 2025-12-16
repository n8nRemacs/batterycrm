package com.avito.android.tariff.cpx.info.advance.mvi;

import dagger.internal.x;
import dagger.internal.y;
import tB0.C48533d;

/* compiled from: TariffCpxInfoAdvanceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f296348a;

    /* renamed from: b, reason: collision with root package name */
    public final e f296349b;

    /* renamed from: c, reason: collision with root package name */
    public final l f296350c;

    /* renamed from: d, reason: collision with root package name */
    public final n f296351d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f296348a = gVar;
        this.f296349b = eVar;
        this.f296350c = lVar;
        this.f296351d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f296348a.get();
        d dVar = (d) this.f296349b.get();
        this.f296350c.getClass();
        k kVar = new k();
        this.f296351d.getClass();
        m mVar = new m();
        C48533d.f439195d.getClass();
        return new i("TariffCpxInfoAdvance", C48533d.f439196e, new h(fVar, dVar, mVar, kVar));
    }
}
