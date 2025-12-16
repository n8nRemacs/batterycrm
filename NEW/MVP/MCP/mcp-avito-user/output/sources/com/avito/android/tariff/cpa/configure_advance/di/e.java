package com.avito.android.tariff.cpa.configure_advance.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureAdvanceModule_ProvideAdapterPresenter$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294267a;

    public e(u uVar) {
        this.f294267a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f294267a.get();
        d dVar = d.f294266a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
