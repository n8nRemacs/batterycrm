package com.avito.android.favorites.di;

import com.avito.android.favorites.C30604b0;
import com.avito.android.favorites.W;
import com.avito.android.favorites.Y;

/* compiled from: FavoritesModule_ProvideFavoriteAdvertsUploadInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<com.avito.android.favorite.r> {

    /* renamed from: a, reason: collision with root package name */
    public final Y f156935a;

    public J(Y y12) {
        this.f156935a = y12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        W w12 = (W) this.f156935a.get();
        F f12 = F.f156931a;
        return new C30604b0(w12);
    }
}
