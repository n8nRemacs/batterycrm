package com.avito.android.validation;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideDestroyableViewHolderBuilder$_avito_discouraged_avito_libs_publish_commonFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class I implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f319266a;

    public I(Provider<com.avito.konveyor.a> provider) {
        this.f319266a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f319266a.get();
        A.f319242a.getClass();
        return new C14699c(aVar);
    }
}
