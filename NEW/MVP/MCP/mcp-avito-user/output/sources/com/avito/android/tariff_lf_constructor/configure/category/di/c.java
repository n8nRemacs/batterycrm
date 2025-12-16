package com.avito.android.tariff_lf_constructor.configure.category.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureCategoryModule_ProvideAdapterPresenter$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299359a;

    public c(u uVar) {
        this.f299359a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f299359a.get();
        b bVar = b.f299358a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
