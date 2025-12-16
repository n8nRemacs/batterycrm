package com.avito.android.similar_adverts.adapter;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarSkeletonAdvertBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f283813a;

    public e(u uVar) {
        this.f283813a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.serp.adapter.skeleton.g) this.f283813a.get());
    }
}
