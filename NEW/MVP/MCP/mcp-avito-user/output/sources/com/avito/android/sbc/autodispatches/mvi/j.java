package com.avito.android.sbc.autodispatches.mvi;

import Po0.InterfaceC14820d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcAutoDispatchesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f258941a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258942b;

    /* renamed from: c, reason: collision with root package name */
    public final e f258943c;

    /* renamed from: d, reason: collision with root package name */
    public final b f258944d;

    public j(g gVar, l lVar, e eVar, b bVar) {
        this.f258941a = gVar;
        this.f258942b = lVar;
        this.f258943c = eVar;
        this.f258944d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f258941a.get();
        this.f258942b.getClass();
        k kVar = new k();
        d dVar = (d) this.f258943c.get();
        this.f258944d.getClass();
        return new i("SbcAutoDispatches", InterfaceC14820d.C0867d.f13300a, new h(fVar, kVar, dVar, new a()));
    }
}
