package com.avito.android.tariff.cpx.levels.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxLevelsListModule_ProvideListRecyclerAdapter$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297055a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f297056b;

    public f(u uVar, Provider provider) {
        this.f297055a = uVar;
        this.f297056b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f297055a.get();
        com.avito.konveyor.a aVar2 = this.f297056b.get();
        b.f297051a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
