package com.avito.android.profile.remove.confirm.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveConfirmFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f223876a;

    /* renamed from: b, reason: collision with root package name */
    public final h f223877b;

    /* renamed from: c, reason: collision with root package name */
    public final j f223878c;

    public f(c cVar, h hVar, j jVar) {
        this.f223876a = cVar;
        this.f223877b = hVar;
        this.f223878c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f223876a.get();
        this.f223877b.getClass();
        g gVar = new g();
        this.f223878c.getClass();
        i iVar = new i();
        J90.d.f8820c.getClass();
        return new e("ProfileRemoveConfirm", J90.d.f8821d, new d(bVar, iVar, gVar));
    }
}
