package com.avito.android.payment_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentListModule_ProvideContentRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f214966a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f214967b;

    public g(u uVar, Provider provider) {
        this.f214966a = uVar;
        this.f214967b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f214966a.get();
        com.avito.konveyor.a aVar2 = this.f214967b.get();
        d.f214963a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
