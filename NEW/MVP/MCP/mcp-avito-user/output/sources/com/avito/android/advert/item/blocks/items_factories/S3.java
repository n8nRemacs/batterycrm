package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsReservationInfoItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S3 implements dagger.internal.h<R3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73857a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f73858b;

    public S3(Provider<com.avito.android.advert.item.similars.j> provider, Provider<C36135w2> provider2) {
        this.f73857a = provider;
        this.f73858b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new R3(this.f73857a.get(), this.f73858b.get());
    }
}
