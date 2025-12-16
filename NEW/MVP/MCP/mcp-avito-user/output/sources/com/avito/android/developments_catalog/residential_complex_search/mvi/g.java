package com.avito.android.developments_catalog.residential_complex_search.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResidentialComplexFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f139217a;

    /* renamed from: b, reason: collision with root package name */
    public final b f139218b;

    /* renamed from: c, reason: collision with root package name */
    public final k f139219c;

    /* renamed from: d, reason: collision with root package name */
    public final m f139220d;

    public g(d dVar, b bVar, k kVar, m mVar) {
        this.f139217a = dVar;
        this.f139218b = bVar;
        this.f139219c = kVar;
        this.f139220d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f139217a.get();
        a aVar = (a) this.f139218b.get();
        this.f139219c.getClass();
        j jVar = new j();
        l lVar = (l) this.f139220d.get();
        n.f139225g.getClass();
        return new f("ResidentialComplex", n.f139226h, new e(cVar, aVar, lVar, jVar));
    }
}
