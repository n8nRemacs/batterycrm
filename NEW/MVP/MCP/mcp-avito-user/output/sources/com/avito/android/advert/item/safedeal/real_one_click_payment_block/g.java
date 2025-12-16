package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealPaymentBlockPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f78925a;

    public g(Provider<InterfaceC28173a> provider) {
        this.f78925a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f78925a.get());
    }
}
