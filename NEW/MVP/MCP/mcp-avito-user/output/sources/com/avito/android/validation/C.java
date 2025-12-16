package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class C implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f319247a;

    public C(Provider<com.avito.konveyor.a> provider) {
        this.f319247a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f319247a.get();
        A.f319242a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
