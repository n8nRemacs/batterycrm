package com.avito.android.publish.screen.step.select.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f242215a;

    /* renamed from: b, reason: collision with root package name */
    public final g f242216b;

    /* renamed from: c, reason: collision with root package name */
    public final n f242217c;

    /* renamed from: d, reason: collision with root package name */
    public final p f242218d;

    public l(i iVar, g gVar, n nVar, p pVar) {
        this.f242215a = iVar;
        this.f242216b = gVar;
        this.f242217c = nVar;
        this.f242218d = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f242215a.get();
        f fVar = (f) this.f242216b.get();
        this.f242217c.getClass();
        m mVar = new m();
        this.f242218d.getClass();
        o oVar = new o();
        Ne0.d.f11679d.getClass();
        return new k("Select", Ne0.d.f11680e, new j(hVar, fVar, oVar, mVar));
    }
}
