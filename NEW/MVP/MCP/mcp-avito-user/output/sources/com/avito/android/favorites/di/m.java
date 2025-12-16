package com.avito.android.favorites.di;

import com.avito.android.favorites.InterfaceC30683q0;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideFavoriteErrorItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.android.favorites.adapter.error.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30683q0> f157330a;

    public m(Provider<InterfaceC30683q0> provider) {
        this.f157330a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30683q0 interfaceC30683q0 = this.f157330a.get();
        C30647e.f157320a.getClass();
        return new com.avito.android.favorites.adapter.error.f(interfaceC30683q0);
    }
}
