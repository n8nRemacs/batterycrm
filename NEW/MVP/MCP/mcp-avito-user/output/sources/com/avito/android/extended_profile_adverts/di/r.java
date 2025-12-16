package com.avito.android.extended_profile_adverts.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsModule_ProvideDestroyableViewHolderBuilder$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final n f150827a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f150828b;

    public r(n nVar, Provider<com.avito.konveyor.a> provider) {
        this.f150827a = nVar;
        this.f150828b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f150828b.get();
        this.f150827a.getClass();
        return new C14699c(aVar);
    }
}
