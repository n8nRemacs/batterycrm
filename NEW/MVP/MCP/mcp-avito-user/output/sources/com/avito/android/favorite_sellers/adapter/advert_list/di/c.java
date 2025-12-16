package com.avito.android.favorite_sellers.adapter.advert_list.di;

import com.avito.android.favorite.m;
import com.avito.android.favorite.n;
import com.avito.android.favorite.p;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertListItemModule_ProvideFavoriteAdvertsPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final m f155533a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f155534b;

    public c(m mVar, Provider provider) {
        this.f155533a = mVar;
        this.f155534b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite.h hVar = (com.avito.android.favorite.h) this.f155533a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f155534b.get();
        int i12 = a.f155531a;
        return new p(hVar, interfaceC35745a5, null);
    }
}
