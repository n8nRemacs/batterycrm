package com.avito.android.favorites.di;

import androidx.fragment.app.Fragment;
import androidx.view.T0;

/* compiled from: FavoriteAdvertsModule_ProvideViewModelStoreOwner$_avito_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<T0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157358a;

    public y(dagger.internal.l lVar) {
        this.f157358a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f157358a.f393949a;
        C30647e.f157320a.getClass();
        return fragment;
    }
}
