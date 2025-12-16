package com.avito.android.advert.deeplinks.want_to_buy;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertWantToBuyInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z9.a> f69042a;

    public e(Provider<Z9.a> provider) {
        this.f69042a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f69042a.get());
    }
}
