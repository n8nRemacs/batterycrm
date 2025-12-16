package com.avito.android.serp.adapter.skeleton;

import com.avito.android.serp.adapter.skeleton.c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SkeletonGenerator_Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<c.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f272237a;

    public e(u uVar) {
        this.f272237a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c.a((AO0.b) this.f272237a.get());
    }
}
