package com.avito.android.settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f280936a;

    /* renamed from: b, reason: collision with root package name */
    public final q f280937b;

    /* renamed from: c, reason: collision with root package name */
    public final s f280938c;

    public k(h hVar, q qVar, s sVar) {
        this.f280936a = hVar;
        this.f280937b = qVar;
        this.f280938c = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f280936a.get();
        p pVar = (p) this.f280937b.get();
        r rVar = (r) this.f280938c.get();
        Nv0.d.f11863h.getClass();
        return new j("Settings", Nv0.d.f11864i, new i(dVar, rVar, pVar));
    }
}
