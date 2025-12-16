package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FbsEntryPointFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f256355a;

    /* renamed from: b, reason: collision with root package name */
    public final c f256356b;

    /* renamed from: c, reason: collision with root package name */
    public final j f256357c;

    public h(e eVar, c cVar, j jVar) {
        this.f256355a = eVar;
        this.f256356b = cVar;
        this.f256357c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f256355a.get();
        b bVar = (b) this.f256356b.get();
        this.f256357c.getClass();
        i iVar = new i();
        Gn0.c.f6734c.getClass();
        return new g("FbsEntryPoint", Gn0.c.f6735d, new f(dVar, bVar, iVar));
    }
}
