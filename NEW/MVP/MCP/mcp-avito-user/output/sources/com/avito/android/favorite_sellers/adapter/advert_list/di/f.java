package com.avito.android.favorite_sellers.adapter.advert_list.di;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertListItemModule_ProvideViewedAdvertsPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<com.avito.android.advert.viewed.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.a> f155537a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.d> f155538b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f155539c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f155540d;

    public f(Provider<com.avito.android.advert.viewed.a> provider, Provider<com.avito.android.advert.viewed.d> provider2, Provider<R0> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f155537a = provider;
        this.f155538b = provider2;
        this.f155539c = provider3;
        this.f155540d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.a aVar = this.f155537a.get();
        com.avito.android.advert.viewed.d dVar = this.f155538b.get();
        R0 r02 = this.f155539c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f155540d.get();
        int i12 = a.f155531a;
        return new com.avito.android.advert.viewed.g(aVar, dVar, r02, interfaceC35745a5);
    }
}
