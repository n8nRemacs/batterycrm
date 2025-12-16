package com.avito.android.konveyor_adapter_module;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdapterModule_ProvideAdapterPresenter$_common_konveyor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f174743a;

    public b(Provider<com.avito.konveyor.a> provider) {
        this.f174743a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f174743a.get();
        int i12 = a.f174742a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
