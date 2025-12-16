package com.avito.android.advert_collection_list.mvi;

import com.avito.android.account.E;
import com.avito.android.remote.H;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_list.f> f82229a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f82230b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f82231c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_list.i> f82232d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f82233e;

    public i(Provider<com.avito.android.advert_collection_list.f> provider, Provider<E> provider2, Provider<H> provider3, Provider<com.avito.android.advert_collection_list.i> provider4, Provider<com.avito.android.deep_linking.x> provider5) {
        this.f82229a = provider;
        this.f82230b = provider2;
        this.f82231c = provider3;
        this.f82232d = provider4;
        this.f82233e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f82229a.get(), this.f82230b.get(), this.f82231c.get(), this.f82232d.get(), this.f82233e.get());
    }
}
