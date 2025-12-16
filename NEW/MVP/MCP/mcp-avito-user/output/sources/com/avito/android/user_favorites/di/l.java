package com.avito.android.user_favorites.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: UserFavoritesModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f316901a;

    public l(dagger.internal.l lVar) {
        this.f316901a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f316901a.f393949a;
        int i12 = i.f316897a;
        return fragment.getChildFragmentManager();
    }
}
