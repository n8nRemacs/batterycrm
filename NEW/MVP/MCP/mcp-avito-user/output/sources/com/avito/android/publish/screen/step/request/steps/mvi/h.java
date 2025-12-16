package com.avito.android.publish.screen.step.request.steps.mvi;

import Me0.C14479d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StepsRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242065a;

    /* renamed from: b, reason: collision with root package name */
    public final c f242066b;

    /* renamed from: c, reason: collision with root package name */
    public final j f242067c;

    /* renamed from: d, reason: collision with root package name */
    public final l f242068d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f242065a = eVar;
        this.f242066b = cVar;
        this.f242067c = jVar;
        this.f242068d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f242065a.get();
        b bVar = (b) this.f242066b.get();
        this.f242067c.getClass();
        i iVar = new i();
        this.f242068d.getClass();
        k kVar = new k();
        C14479d.f10974c.getClass();
        return new g("StepsRequest", C14479d.f10975d, new f(dVar, bVar, kVar, iVar));
    }
}
