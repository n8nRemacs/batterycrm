package com.avito.android.payment.lib.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f214637a;

    public k(dagger.internal.u uVar) {
        this.f214637a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f214637a.get();
        int i12 = d.f214619a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
