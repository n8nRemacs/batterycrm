package com.avito.android.mortgage.root.list.items.realty_object;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RealtyObjectBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f202740a;

    public b(f fVar) {
        this.f202740a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f202740a.get());
    }
}
