package com.avito.android.rating.details.adapter.action;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246485a;

    public b(u uVar) {
        this.f246485a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f246485a.get());
    }
}
