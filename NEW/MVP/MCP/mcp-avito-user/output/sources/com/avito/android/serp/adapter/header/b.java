package com.avito.android.serp.adapter.header;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270141a;

    public b(u uVar) {
        this.f270141a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f270141a.get());
    }
}
