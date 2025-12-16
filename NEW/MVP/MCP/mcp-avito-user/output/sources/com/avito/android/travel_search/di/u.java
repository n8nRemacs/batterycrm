package com.avito.android.travel_search.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f303084a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f303085b;

    public u(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f303084a = lVar;
        this.f303085b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f303084a.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f303085b.f393949a;
        p.f303076a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
