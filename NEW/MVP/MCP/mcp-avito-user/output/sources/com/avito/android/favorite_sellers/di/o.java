package com.avito.android.favorite_sellers.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSellersModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f155884a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f155885b;

    public o(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f155884a = lVar;
        this.f155885b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f155884a.f393949a;
        r rVar = (r) this.f155885b.f393949a;
        d.f155872a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
