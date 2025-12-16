package com.avito.android.search.filter.adapter.input;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262414a;

    public b(u uVar) {
        this.f262414a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f262414a.get());
    }
}
