package com.avito.android.favorites.adapter.advert.skeleton;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SkeletonFavoriteAdvertItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156508a;

    public b(u uVar) {
        this.f156508a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f156508a.get());
    }
}
