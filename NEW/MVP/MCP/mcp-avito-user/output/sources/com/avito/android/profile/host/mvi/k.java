package com.avito.android.profile.host.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserProfileHostFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f222414a;

    /* renamed from: b, reason: collision with root package name */
    public final f f222415b;

    /* renamed from: c, reason: collision with root package name */
    public final m f222416c;

    /* renamed from: d, reason: collision with root package name */
    public final o f222417d;

    public k(h hVar, f fVar, m mVar, o oVar) {
        this.f222414a = hVar;
        this.f222415b = fVar;
        this.f222416c = mVar;
        this.f222417d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f222414a.get();
        e eVar = (e) this.f222415b.get();
        this.f222416c.getClass();
        l lVar = new l();
        this.f222417d.getClass();
        n nVar = new n();
        q90.d.f429063d.getClass();
        return new j("UserProfileHost", q90.d.f429064e, new i(gVar, eVar, nVar, lVar));
    }
}
