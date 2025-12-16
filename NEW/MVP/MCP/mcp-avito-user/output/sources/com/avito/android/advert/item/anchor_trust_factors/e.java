package com.avito.android.advert.item.anchor_trust_factors;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAnchorTrustFactorsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f72823a;

    public e(Provider<l> provider) {
        this.f72823a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f72823a.get());
    }
}
