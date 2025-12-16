package com.avito.android.advert.item.fmp.products;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpProductsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f75616a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_calculator.data.b> f75617b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_calculator.data.h> f75618c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75619d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f75620e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75621f;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f75616a = lVar;
        this.f75617b = provider;
        this.f75618c = provider2;
        this.f75619d = provider3;
        this.f75620e = provider4;
        this.f75621f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f75616a.f393949a, this.f75617b.get(), this.f75618c.get(), this.f75619d.get(), this.f75620e.get(), this.f75621f.get());
    }
}
