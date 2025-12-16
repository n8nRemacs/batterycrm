package com.avito.android.favorites.di;

import com.avito.android.favorites.InterfaceC30683q0;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideFavoriteLoadingItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<com.avito.android.favorites.adapter.loading.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30683q0> f157347a;

    public o(Provider<InterfaceC30683q0> provider) {
        this.f157347a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30683q0 interfaceC30683q0 = this.f157347a.get();
        C30647e.f157320a.getClass();
        return new com.avito.android.favorites.adapter.loading.d(interfaceC30683q0);
    }
}
