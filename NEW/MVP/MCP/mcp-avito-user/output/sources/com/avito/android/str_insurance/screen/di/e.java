package com.avito.android.str_insurance.screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceAdapterModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f288700a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288701b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f288702c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.str_insurance.items.b f288703d;

    public e(b bVar, u uVar, Provider provider, com.avito.android.str_insurance.items.b bVar2) {
        this.f288700a = bVar;
        this.f288701b = uVar;
        this.f288702c = provider;
        this.f288703d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f288701b.get();
        com.avito.konveyor.a aVar2 = this.f288702c.get();
        this.f288703d.getClass();
        com.avito.android.str_insurance.items.a aVar3 = new com.avito.android.str_insurance.items.a();
        this.f288700a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
