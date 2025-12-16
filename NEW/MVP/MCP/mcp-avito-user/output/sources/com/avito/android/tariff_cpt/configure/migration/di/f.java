package com.avito.android.tariff_cpt.configure.migration.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptMigrationModule_ProvideListRecyclerAdapter$_avito_tariff_cpt_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298031b;

    public f(u uVar, Provider provider) {
        this.f298030a = uVar;
        this.f298031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f298030a.get();
        com.avito.konveyor.a aVar2 = this.f298031b.get();
        b.f298022a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
