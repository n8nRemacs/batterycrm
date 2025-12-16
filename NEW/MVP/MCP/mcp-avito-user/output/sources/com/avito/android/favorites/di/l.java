package com.avito.android.favorites.di;

/* compiled from: FavoriteAdvertsModule_ProvideFavoriteAdapterPresenter$_avito_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f157329a;

    public l(dagger.internal.u uVar) {
        this.f157329a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f157329a.get();
        C30647e c30647e = C30647e.f157320a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
