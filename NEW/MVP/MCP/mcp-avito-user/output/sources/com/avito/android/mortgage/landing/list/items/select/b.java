package com.avito.android.mortgage.landing.list.items.select;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f199963a;

    public b(e eVar) {
        this.f199963a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f199963a.get());
    }
}
