package com.avito.android.developments_agency_search.screen.help_center.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HelpCenterFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f138032a;

    /* renamed from: b, reason: collision with root package name */
    public final f f138033b;

    /* renamed from: c, reason: collision with root package name */
    public final m f138034c;

    /* renamed from: d, reason: collision with root package name */
    public final o f138035d;

    public k(h hVar, f fVar, m mVar, o oVar) {
        this.f138032a = hVar;
        this.f138033b = fVar;
        this.f138034c = mVar;
        this.f138035d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f138032a.get();
        e eVar = (e) this.f138033b.get();
        l lVar = (l) this.f138034c.get();
        this.f138035d.getClass();
        n nVar = new n();
        Gw.d.f6797c.getClass();
        return new j("HelpCenter", Gw.d.f6798d, new i(gVar, eVar, nVar, lVar));
    }
}
