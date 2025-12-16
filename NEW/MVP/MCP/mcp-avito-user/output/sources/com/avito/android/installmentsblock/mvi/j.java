package com.avito.android.installmentsblock.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsBlockFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f173001a;

    /* renamed from: b, reason: collision with root package name */
    public final e f173002b;

    /* renamed from: c, reason: collision with root package name */
    public final l f173003c;

    /* renamed from: d, reason: collision with root package name */
    public final n f173004d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f173001a = gVar;
        this.f173002b = eVar;
        this.f173003c = lVar;
        this.f173004d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f173001a.get();
        d dVar = (d) this.f173002b.get();
        k kVar = (k) this.f173003c.get();
        this.f173004d.getClass();
        m mVar = new m();
        dO.d.f393843d.getClass();
        return new i("InstallmentsBlock", dO.d.f393844e, new h(fVar, dVar, mVar, kVar));
    }
}
