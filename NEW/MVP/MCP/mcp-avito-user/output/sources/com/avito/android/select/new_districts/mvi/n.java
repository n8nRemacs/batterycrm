package com.avito.android.select.new_districts.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FilterSelectDistrictViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final h f265857a;

    public n(h hVar) {
        this.f265857a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((f) this.f265857a.get(), null, 2, null);
    }
}
