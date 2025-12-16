package com.avito.android.advert.item.compatibility.v3.item.show_all_brands;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShowAllBrandsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.compatibility.v3.b> f74451a;

    public g(Provider<com.avito.android.advert.item.compatibility.v3.b> provider) {
        this.f74451a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f74451a.get());
    }
}
