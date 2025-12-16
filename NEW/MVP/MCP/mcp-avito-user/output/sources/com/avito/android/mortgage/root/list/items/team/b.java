package com.avito.android.mortgage.root.list.items.team;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TeamBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f202853a;

    public b(k kVar) {
        this.f202853a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((j) this.f202853a.get());
    }
}
