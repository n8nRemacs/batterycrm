package com.avito.android.advert.item.delivery_suggests;

import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliverySuggestsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f75115a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_with_delivery.c> f75116b;

    public i(Provider<InterfaceC28173a> provider, Provider<com.avito.android.advert_core.price_with_delivery.c> provider2) {
        this.f75115a = provider;
        this.f75116b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f75115a.get(), this.f75116b.get());
    }
}
