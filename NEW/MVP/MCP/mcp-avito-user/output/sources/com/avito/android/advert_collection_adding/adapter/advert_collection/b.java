package com.avito.android.advert_collection_adding.adapter.advert_collection;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f81760a;

    public b(u uVar) {
        this.f81760a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f81760a.get());
    }
}
