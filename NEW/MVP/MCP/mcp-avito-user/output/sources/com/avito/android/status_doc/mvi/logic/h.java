package com.avito.android.status_doc.mvi.logic;

import Ax0.C13101e;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigStatusDocFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f284950a;

    /* renamed from: b, reason: collision with root package name */
    public final c f284951b;

    /* renamed from: c, reason: collision with root package name */
    public final j f284952c;

    /* renamed from: d, reason: collision with root package name */
    public final l f284953d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f284950a = eVar;
        this.f284951b = cVar;
        this.f284952c = jVar;
        this.f284953d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f284950a.get();
        b bVar = (b) this.f284951b.get();
        this.f284952c.getClass();
        i iVar = new i();
        this.f284953d.getClass();
        return new g("GigStatusDocFlow", C13101e.f731a, new f(dVar, bVar, new k(), iVar));
    }
}
