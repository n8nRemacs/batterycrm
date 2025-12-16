package com.avito.android.favorite_sellers.di;

import com.avito.android.serp.adapter.InterfaceC34863v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Y1;

/* compiled from: FavoriteSellersModule_ProvideAdvertItemListener$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<InterfaceC34863v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155877a;

    public h(u uVar) {
        this.f155877a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1 y12 = (Y1) this.f155877a.get();
        d.f155872a.getClass();
        return new e(y12);
    }
}
