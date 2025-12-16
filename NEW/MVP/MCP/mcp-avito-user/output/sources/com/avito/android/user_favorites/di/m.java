package com.avito.android.user_favorites.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* compiled from: UserFavoritesModule_ProvideResourceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f316902a;

    public m(dagger.internal.l lVar) {
        this.f316902a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f316902a.f393949a;
        int i12 = i.f316897a;
        return fragment.getResources();
    }
}
