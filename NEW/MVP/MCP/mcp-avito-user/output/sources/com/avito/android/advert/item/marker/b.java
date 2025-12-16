package com.avito.android.advert.item.marker;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MarkerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77463a;

    public b(u uVar) {
        this.f77463a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f77463a.get());
    }
}
