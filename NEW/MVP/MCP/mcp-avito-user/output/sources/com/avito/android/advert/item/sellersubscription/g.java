package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSellerSubscriptionPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<C28208f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<AbstractC13232a>> f79742a;

    public g(Provider<l41.g<AbstractC13232a>> provider) {
        this.f79742a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28208f(this.f79742a.get());
    }
}
