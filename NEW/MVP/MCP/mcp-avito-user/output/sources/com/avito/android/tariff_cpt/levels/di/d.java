package com.avito.android.tariff_cpt.levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelsListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298594a;

    public d(u uVar) {
        this.f298594a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f298594a.get();
        c.f298593a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
