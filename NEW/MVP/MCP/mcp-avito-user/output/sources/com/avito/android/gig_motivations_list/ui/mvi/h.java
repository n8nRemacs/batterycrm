package com.avito.android.gig_motivations_list.ui.mvi;

import dagger.internal.x;
import dagger.internal.y;
import zH.C50465d;

/* compiled from: MotivationsListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f160380a;

    /* renamed from: b, reason: collision with root package name */
    public final c f160381b;

    /* renamed from: c, reason: collision with root package name */
    public final j f160382c;

    /* renamed from: d, reason: collision with root package name */
    public final l f160383d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f160380a = eVar;
        this.f160381b = cVar;
        this.f160382c = jVar;
        this.f160383d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f160380a.get();
        b bVar = (b) this.f160381b.get();
        this.f160382c.getClass();
        i iVar = new i();
        this.f160383d.getClass();
        k kVar = new k();
        C50465d.f443999d.getClass();
        return new g("MotivationsList", C50465d.f444000e, new f(dVar, bVar, kVar, iVar));
    }
}
