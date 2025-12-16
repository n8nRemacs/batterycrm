package com.avito.android.advert.di;

/* compiled from: AdvertFragmentModule_ProviderViewModelCommercialLoadedAdHolderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class q0 implements dagger.internal.h<com.avito.android.advertising.loaders.beduin.H> {

    /* renamed from: a, reason: collision with root package name */
    public final B4.c f69461a;

    public q0(B4.c cVar) {
        this.f69461a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.item.beduin.k kVar = (com.avito.android.advert.item.beduin.k) this.f69461a.get();
        C27710t.f69463a.getClass();
        com.avito.android.advertising.loaders.beduin.H f73242l = kVar.getF73242L();
        dagger.internal.t.d(f73242l);
        return f73242l;
    }
}
