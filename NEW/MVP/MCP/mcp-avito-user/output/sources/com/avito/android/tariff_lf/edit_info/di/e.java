package com.avito.android.tariff_lf.edit_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditInfoModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f298841a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f298842b;

    /* renamed from: c, reason: collision with root package name */
    public final u f298843c;

    public e(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f298841a = fVar;
        this.f298842b = provider;
        this.f298843c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f298841a);
        com.avito.konveyor.adapter.a aVar = this.f298842b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f298843c.get();
        c cVar = c.f298839a;
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
