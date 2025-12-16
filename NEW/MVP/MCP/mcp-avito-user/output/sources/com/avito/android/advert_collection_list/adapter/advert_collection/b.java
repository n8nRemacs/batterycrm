package com.avito.android.advert_collection_list.adapter.advert_collection;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f82049a;

    public b(Provider<d> provider) {
        this.f82049a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f82049a.get());
    }
}
