package com.avito.android.realty_agency.inline_filters.district.mvi;

import dagger.internal.x;
import dagger.internal.y;
import ii0.C41413d;

/* compiled from: DistrictFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f251602a;

    /* renamed from: b, reason: collision with root package name */
    public final c f251603b;

    /* renamed from: c, reason: collision with root package name */
    public final j f251604c;

    /* renamed from: d, reason: collision with root package name */
    public final l f251605d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f251602a = eVar;
        this.f251603b = cVar;
        this.f251604c = jVar;
        this.f251605d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f251602a.get();
        this.f251603b.getClass();
        b bVar = new b();
        this.f251604c.getClass();
        i iVar = new i();
        this.f251605d.getClass();
        k kVar = new k();
        C41413d.f398698e.getClass();
        return new g("District", C41413d.f398699f, new f(dVar, bVar, kVar, iVar));
    }
}
