package com.avito.android.favorites.di;

import com.avito.android.favorites.S;
import com.avito.android.favorites.V;
import javax.inject.Provider;

/* compiled from: FavoritesModule_ProvideFavoriteAdvertsSyncEventProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<S> f156933a;

    public H(Provider<S> provider) {
        this.f156933a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        S s5 = this.f156933a.get();
        F f12 = F.f156931a;
        return s5;
    }
}
