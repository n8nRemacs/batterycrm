package com.avito.android.advert.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideDestroyableViewHolderBuilder$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class K implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f69112a;

    public K(Provider<com.avito.konveyor.a> provider) {
        this.f69112a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f69112a.get();
        C27710t.f69463a.getClass();
        return new C14699c(aVar);
    }
}
