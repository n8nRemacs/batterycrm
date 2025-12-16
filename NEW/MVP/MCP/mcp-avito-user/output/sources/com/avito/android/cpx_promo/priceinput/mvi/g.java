package com.avito.android.cpx_promo.priceinput.mvi;

import dagger.internal.x;
import dagger.internal.y;
import is.C42098c;

/* compiled from: CpxPromoPriceInputFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f127340a;

    /* renamed from: b, reason: collision with root package name */
    public final b f127341b;

    /* renamed from: c, reason: collision with root package name */
    public final i f127342c;

    /* renamed from: d, reason: collision with root package name */
    public final k f127343d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f127340a = dVar;
        this.f127341b = bVar;
        this.f127342c = iVar;
        this.f127343d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f127340a.get();
        a aVar = (a) this.f127341b.get();
        this.f127342c.getClass();
        h hVar = new h();
        this.f127343d.getClass();
        j jVar = new j();
        C42098c.f405318g.getClass();
        return new f("CpxPromoPriceInput", C42098c.f405319h, new e(cVar, aVar, jVar, hVar));
    }
}
