package com.avito.android.silent_update.permissions.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PermissionsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.silent_update.permissions.j f283730a;

    /* renamed from: b, reason: collision with root package name */
    public final Ew0.d f283731b;

    /* renamed from: c, reason: collision with root package name */
    public final l f283732c;

    public e(com.avito.android.silent_update.permissions.j jVar, Ew0.d dVar, l lVar) {
        this.f283730a = jVar;
        this.f283731b = dVar;
        this.f283732c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.silent_update.permissions.i) this.f283730a.get(), (Ew0.c) this.f283731b.get(), (String) this.f283732c.f393949a);
    }
}
