package com.avito.android.advert.di;

import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideAdapterPresenter$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.di.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27792z implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f71151a;

    public C27792z(Provider<com.avito.konveyor.a> provider) {
        this.f71151a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f71151a.get();
        C27710t.f69463a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
