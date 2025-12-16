package com.avito.android.tariff_lf_constructor.configure.locations.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureLocationsModule_ProvideAdapterPresenter$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299880a;

    public c(u uVar) {
        this.f299880a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f299880a.get();
        b bVar = b.f299879a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
