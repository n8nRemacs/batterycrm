package com.avito.android.advert_collection_adding.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionAddingReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final d f81920a;

    /* renamed from: b, reason: collision with root package name */
    public final s f81921b;

    public o(d dVar, s sVar) {
        this.f81920a = dVar;
        this.f81921b = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f81920a.getClass();
        c cVar = new c();
        this.f81921b.getClass();
        return new n(cVar, new r());
    }
}
