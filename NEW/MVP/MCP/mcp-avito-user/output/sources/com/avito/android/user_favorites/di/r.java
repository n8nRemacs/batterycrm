package com.avito.android.user_favorites.di;

import android.content.Context;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import javax.inject.Provider;

/* compiled from: UserFavoritesModule_ProvideTabsLayout$_avito_user_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<com.avito.android.user_favorites.adapter.a<FavoritesTab>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab>> f316911a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f316912b;

    public r(dagger.internal.u uVar, Provider provider) {
        this.f316911a = provider;
        this.f316912b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab> jVar = this.f316911a.get();
        Context context = (Context) this.f316912b.get();
        int i12 = i.f316897a;
        return new com.avito.android.user_favorites.adapter.a(jVar, context);
    }
}
