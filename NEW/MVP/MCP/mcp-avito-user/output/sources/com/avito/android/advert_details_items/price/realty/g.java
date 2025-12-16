package com.avito.android.advert_details_items.price.realty;

import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNormalizedAndHistoryPricesPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f85245a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f85246b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f85247c;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC30570d> provider2, Provider<R0> provider3) {
        this.f85245a = provider;
        this.f85246b = provider2;
        this.f85247c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f85245a.get(), this.f85246b.get(), this.f85247c.get());
    }
}
