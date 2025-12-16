package com.avito.android.advert.item.short_term_rent.item_discount;

import com.avito.android.advert.item.short_term_rent.item_discount.c;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentItemDiscountPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f80055b;

    /* renamed from: c, reason: collision with root package name */
    public final l f80056c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f80057d;

    public g(dagger.internal.f fVar, l lVar, Provider provider, Provider provider2) {
        this.f80054a = provider;
        this.f80055b = provider2;
        this.f80056c = lVar;
        this.f80057d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f80054a.get(), this.f80055b.get(), (String) this.f80056c.f393949a, (c.a) this.f80057d.get());
    }
}
