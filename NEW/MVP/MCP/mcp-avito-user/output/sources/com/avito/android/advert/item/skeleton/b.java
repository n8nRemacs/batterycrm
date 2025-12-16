package com.avito.android.advert.item.skeleton;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsSkeletonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f80366a;

    public b(u uVar) {
        this.f80366a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f80366a.get());
    }
}
