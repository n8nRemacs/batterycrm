package com.avito.android.favorites;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsServiceInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class O implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZC.c> f156306a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f156307b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f156308c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<S> f156309d;

    public O(Provider<ZC.c> provider, Provider<com.avito.android.favorite.x> provider2, Provider<InterfaceC28373a> provider3, Provider<S> provider4) {
        this.f156306a = provider;
        this.f156307b = provider2;
        this.f156308c = provider3;
        this.f156309d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f156306a.get(), this.f156307b.get(), this.f156308c.get(), this.f156309d.get());
    }
}
