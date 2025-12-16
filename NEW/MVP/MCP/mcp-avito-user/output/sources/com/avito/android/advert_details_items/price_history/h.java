package com.avito.android.advert_details_items.price_history;

import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceHistoryPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f85402a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f85403b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f85404c;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC30570d> provider2, Provider<R0> provider3) {
        this.f85402a = provider;
        this.f85403b = provider2;
        this.f85404c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f85402a.get(), this.f85403b.get(), this.f85404c.get());
    }
}
