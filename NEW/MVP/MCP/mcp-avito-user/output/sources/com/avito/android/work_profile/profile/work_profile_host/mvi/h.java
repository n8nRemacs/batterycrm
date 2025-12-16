package com.avito.android.work_profile.profile.work_profile_host.mvi;

import dagger.internal.x;
import dagger.internal.y;
import rQ0.C47587b;

/* compiled from: WorkProfileHostFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f331285a;

    /* renamed from: b, reason: collision with root package name */
    public final c f331286b;

    /* renamed from: c, reason: collision with root package name */
    public final j f331287c;

    public h(e eVar, c cVar, j jVar) {
        this.f331285a = eVar;
        this.f331286b = cVar;
        this.f331287c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f331285a.get();
        b bVar = (b) this.f331286b.get();
        this.f331287c.getClass();
        return new g("WorkProfileHostFragment", new C47587b(null, null, false, null, 15, null), new f(dVar, bVar, new i()));
    }
}
