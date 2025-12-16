package com.avito.android.sbc.autodispatches.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcAutoDispatchesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f258934a;

    public e(u uVar) {
        this.f258934a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.sbc.autodispatches.m) this.f258934a.get());
    }
}
