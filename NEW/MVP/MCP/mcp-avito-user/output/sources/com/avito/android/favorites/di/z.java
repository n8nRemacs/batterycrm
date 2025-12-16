package com.avito.android.favorites.di;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.favorites.di.C30612a;
import com.avito.android.preloading.j;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import kotlin.G0;

/* compiled from: FavoriteAdvertsModule_ProvideWidgetPreloadingPromiseFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<com.avito.android.preloading.j<G0, FavoriteItemsWidgets>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f157359a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorites.preloading.j f157360b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f157361c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f157362d;

    public z(Provider provider, com.avito.android.favorites.preloading.j jVar, Provider provider2, dagger.internal.l lVar) {
        this.f157359a = provider;
        this.f157360b = jVar;
        this.f157361c = provider2;
        this.f157362d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PreloadingPromiseTestGroup preloadingPromiseTestGroupY1 = ((C30612a.c.l0) this.f157359a).f157281a.Y1();
        com.avito.android.favorites.preloading.h hVar = (com.avito.android.favorites.preloading.h) this.f157360b.get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C30612a.c.C30633p) this.f157361c).get();
        Kundle kundle = (Kundle) this.f157362d.f393949a;
        C30647e.f157320a.getClass();
        j.a aVar = com.avito.android.preloading.j.f221853g;
        boolean z12 = preloadingPromiseTestGroupY1.a() && kundle == null;
        aVar.getClass();
        return z12 ? new com.avito.android.preloading.a(G0.f406611a, hVar, c12) : new com.avito.android.preloading.b(hVar, c12);
    }
}
