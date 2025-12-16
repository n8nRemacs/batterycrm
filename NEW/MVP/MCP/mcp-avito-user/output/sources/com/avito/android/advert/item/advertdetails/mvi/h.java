package com.avito.android.advert.item.advertdetails.mvi;

import com.avito.android.Z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z0> f72711a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.trust_factors.h f72712b;

    public h(Provider provider, com.avito.android.advert.item.safedeal.trust_factors.h hVar) {
        this.f72711a = provider;
        this.f72712b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f72711a.get();
        return new f((com.avito.android.advert.item.safedeal.trust_factors.f) this.f72712b.get());
    }
}
