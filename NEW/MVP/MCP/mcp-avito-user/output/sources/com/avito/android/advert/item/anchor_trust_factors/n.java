package com.avito.android.advert.item.anchor_trust_factors;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAnchorsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.anchor_trust_factors.topbar.d> f72848a;

    public n(Provider<com.avito.android.advert.item.anchor_trust_factors.topbar.d> provider) {
        this.f72848a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f72848a.get());
    }
}
