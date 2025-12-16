package com.avito.android.developments_catalog.residential_complex_search.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ResidentialComplexMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final g f139221a;

    public i(g gVar) {
        this.f139221a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f139221a.get();
        i2.f411430a.getClass();
        return new h(fVar, i2.a.f411433c);
    }
}
