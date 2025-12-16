package com.avito.android.sbc.autodispatcheslist.mvi;

import Ro0.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcAutoDispatchesListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f259134a;

    /* renamed from: b, reason: collision with root package name */
    public final k f259135b;

    /* renamed from: c, reason: collision with root package name */
    public final d f259136c;

    /* renamed from: d, reason: collision with root package name */
    public final b f259137d;

    public i(f fVar, k kVar, d dVar, b bVar) {
        this.f259134a = fVar;
        this.f259135b = kVar;
        this.f259136c = dVar;
        this.f259137d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f259134a.get();
        j jVar = (j) this.f259135b.get();
        c cVar = (c) this.f259136c.get();
        this.f259137d.getClass();
        return new h("SbcAutoDispatchesList", d.b.f14647a, new g(eVar, jVar, cVar, new a()));
    }
}
