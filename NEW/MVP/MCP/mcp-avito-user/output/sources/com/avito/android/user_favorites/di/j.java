package com.avito.android.user_favorites.di;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* compiled from: UserFavoritesModule_ProvideContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f316898a;

    public j(dagger.internal.l lVar) {
        this.f316898a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f316898a.f393949a;
        int i12 = i.f316897a;
        return fragment.requireContext();
    }
}
