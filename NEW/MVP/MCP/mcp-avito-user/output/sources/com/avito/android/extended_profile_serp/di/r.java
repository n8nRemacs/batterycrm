package com.avito.android.extended_profile_serp.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideDestroyableViewHolderBuilder$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f152865a;

    public r(Provider<com.avito.konveyor.a> provider) {
        this.f152865a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f152865a.get();
        C30538h.f152853a.getClass();
        return new C14699c(aVar);
    }
}
