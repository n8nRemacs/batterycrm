package com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionSkeletonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f81778a;

    public b(u uVar) {
        this.f81778a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f81778a.get());
    }
}
