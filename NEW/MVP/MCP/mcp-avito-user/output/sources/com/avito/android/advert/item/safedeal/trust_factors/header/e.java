package com.avito.android.advert.item.safedeal.trust_factors.header;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsHeaderPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.safedeal.trust_factors.d> f79165a;

    public e(Provider<com.avito.android.advert.item.safedeal.trust_factors.d> provider) {
        this.f79165a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f79165a.get());
    }
}
