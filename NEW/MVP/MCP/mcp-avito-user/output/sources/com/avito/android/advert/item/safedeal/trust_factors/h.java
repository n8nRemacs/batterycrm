package com.avito.android.advert.item.safedeal.trust_factors;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsComponentsMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f79149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<J0> f79150b;

    public h(Provider<com.avito.android.advert.item.similars.j> provider, Provider<J0> provider2) {
        this.f79149a = provider;
        this.f79150b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f79150b.get(), this.f79149a.get());
    }
}
