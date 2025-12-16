package com.avito.android.advert_collection_adding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddToCollectionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_adding.k> f81874a;

    public b(Provider<com.avito.android.advert_collection_adding.k> provider) {
        this.f81874a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f81874a.get());
    }
}
