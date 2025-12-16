package com.avito.android.advert_collection_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_list.i> f82297a;

    public r(Provider<com.avito.android.advert_collection_list.i> provider) {
        this.f82297a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f82297a.get());
    }
}
