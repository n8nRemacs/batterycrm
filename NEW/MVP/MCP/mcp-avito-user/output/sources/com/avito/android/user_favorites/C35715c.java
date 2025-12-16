package com.avito.android.user_favorites;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: FavoritesSearchLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_favorites.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35715c implements dagger.internal.h<C35714b> {

    /* renamed from: a, reason: collision with root package name */
    public final n f316864a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f316865b;

    public C35715c(n nVar, dv.b bVar) {
        this.f316864a = nVar;
        this.f316865b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35714b((InterfaceC35727l) this.f316864a.get(), (a.InterfaceC4053a) this.f316865b.get());
    }
}
