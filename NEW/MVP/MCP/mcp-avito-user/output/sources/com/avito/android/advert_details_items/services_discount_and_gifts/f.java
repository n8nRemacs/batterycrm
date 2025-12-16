package com.avito.android.advert_details_items.services_discount_and_gifts;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f85669a;

    public f(Provider<InterfaceC28373a> provider) {
        this.f85669a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85669a.get());
    }
}
