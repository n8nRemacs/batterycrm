package com.avito.android.silent_update.permissions.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PermissionsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f283747a;

    /* renamed from: b, reason: collision with root package name */
    public final b f283748b;

    /* renamed from: c, reason: collision with root package name */
    public final j f283749c;

    public h(e eVar, b bVar, j jVar) {
        this.f283747a = eVar;
        this.f283748b = bVar;
        this.f283749c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f283747a.get();
        this.f283748b.getClass();
        a aVar = new a();
        this.f283749c.getClass();
        i iVar = new i();
        Fw0.c.f6038c.getClass();
        return new g("Permissions", Fw0.c.f6039d, new f(aVar, dVar, iVar));
    }
}
