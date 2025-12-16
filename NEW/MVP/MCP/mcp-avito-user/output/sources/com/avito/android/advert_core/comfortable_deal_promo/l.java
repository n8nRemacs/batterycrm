package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComfortableDealPromoItemFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f83099a;

    public l(Provider<InterfaceC28373a> provider) {
        this.f83099a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f83099a.get());
    }
}
