package com.avito.android.tariff.cpr.configure.advance.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CprConfigureListModule_ProvideAdapterPresenter$_avito_tariff_cpr_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295208a;

    public f(u uVar) {
        this.f295208a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f295208a.get();
        e.f295207a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
