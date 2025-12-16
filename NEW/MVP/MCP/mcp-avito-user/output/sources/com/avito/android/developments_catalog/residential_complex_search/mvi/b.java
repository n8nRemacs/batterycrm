package com.avito.android.developments_catalog.residential_complex_search.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResidentialComplexActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f139200a;

    public b(u uVar) {
        this.f139200a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.developments_catalog.residential_complex_search.h) this.f139200a.get());
    }
}
