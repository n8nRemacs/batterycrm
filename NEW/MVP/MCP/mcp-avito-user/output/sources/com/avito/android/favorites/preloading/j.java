package com.avito.android.favorites.preloading;

import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsWidgetsPreloadable_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZC.c> f157424a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f157425b;

    /* renamed from: c, reason: collision with root package name */
    public final l f157426c;

    public j(l lVar, Provider provider, Provider provider2) {
        this.f157424a = provider;
        this.f157425b = provider2;
        this.f157426c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f157424a.get(), this.f157425b.get(), (FavoritesSpace) this.f157426c.f393949a);
    }
}
