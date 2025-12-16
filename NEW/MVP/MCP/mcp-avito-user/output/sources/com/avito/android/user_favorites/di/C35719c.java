package com.avito.android.user_favorites.di;

import com.avito.android.user_favorites.C35713a;
import com.avito.android.user_favorites.C35715c;
import com.avito.android.user_favorites.FavoritesLink;
import lv.C43834a;

/* compiled from: FavoritesSearchLinkHandlerModule_ProvideFavoriteSearchLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_favorites.di.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35719c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35718b f316893a;

    /* renamed from: b, reason: collision with root package name */
    public final C35715c f316894b;

    public C35719c(C35718b c35718b, C35715c c35715c) {
        this.f316893a = c35718b;
        this.f316894b = c35715c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35715c c35715c = this.f316894b;
        this.f316893a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FavoritesLink.class, new C35713a(), new C43834a.b.C11809b(c35715c));
    }
}
