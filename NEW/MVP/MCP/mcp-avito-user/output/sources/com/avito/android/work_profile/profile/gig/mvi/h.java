package com.avito.android.work_profile.profile.gig.mvi;

import dagger.internal.x;
import dagger.internal.y;
import oQ0.C44681c;

/* compiled from: GigFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f331137a;

    /* renamed from: b, reason: collision with root package name */
    public final j f331138b;

    /* renamed from: c, reason: collision with root package name */
    public final e f331139c;

    public h(c cVar, j jVar, e eVar) {
        this.f331137a = cVar;
        this.f331138b = jVar;
        this.f331139c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f331137a.get();
        this.f331138b.getClass();
        return new g("GigFragment", new C44681c(null, false, false, false, 15, null), new f(bVar, new i(), (d) this.f331139c.get()));
    }
}
