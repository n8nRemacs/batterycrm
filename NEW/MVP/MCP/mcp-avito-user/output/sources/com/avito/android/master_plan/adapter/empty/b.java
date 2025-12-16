package com.avito.android.master_plan.adapter.empty;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptyInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f185993a;

    public b(u uVar) {
        this.f185993a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f185993a.get());
    }
}
