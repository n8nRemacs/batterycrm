package com.avito.android.checkout.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yo.C50273a;

/* compiled from: CheckoutListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f118251a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f118252b;

    public m(dagger.internal.u uVar, Provider provider) {
        this.f118251a = uVar;
        this.f118252b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f118251a.get();
        com.avito.konveyor.a aVar2 = this.f118252b.get();
        j.f118245a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C50273a());
    }
}
