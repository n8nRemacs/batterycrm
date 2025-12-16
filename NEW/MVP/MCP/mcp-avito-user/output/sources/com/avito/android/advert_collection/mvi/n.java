package com.avito.android.advert_collection.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection.l> f81680a;

    public n(Provider<com.avito.android.advert_collection.l> provider) {
        this.f81680a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f81680a.get());
    }
}
