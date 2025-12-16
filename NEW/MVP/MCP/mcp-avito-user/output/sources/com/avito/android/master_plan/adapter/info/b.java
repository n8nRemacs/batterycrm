package com.avito.android.master_plan.adapter.info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186003a;

    public b(u uVar) {
        this.f186003a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f186003a.get());
    }
}
