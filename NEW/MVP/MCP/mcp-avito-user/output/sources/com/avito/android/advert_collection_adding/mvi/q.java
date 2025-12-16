package com.avito.android.advert_collection_adding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateCollectionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_adding.k> f81923a;

    public q(Provider<com.avito.android.advert_collection_adding.k> provider) {
        this.f81923a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f81923a.get());
    }
}
