package com.avito.android.publish.step.request.suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f245487a;

    /* renamed from: b, reason: collision with root package name */
    public final c f245488b;

    /* renamed from: c, reason: collision with root package name */
    public final j f245489c;

    /* renamed from: d, reason: collision with root package name */
    public final l f245490d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f245487a = eVar;
        this.f245488b = cVar;
        this.f245489c = jVar;
        this.f245490d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f245487a.get();
        b bVar = (b) this.f245488b.get();
        this.f245489c.getClass();
        i iVar = new i();
        this.f245490d.getClass();
        k kVar = new k();
        Bf0.d.f1588a.getClass();
        return new g("SuggestRequest", Bf0.d.f1589b, new f(dVar, bVar, kVar, iVar));
    }
}
