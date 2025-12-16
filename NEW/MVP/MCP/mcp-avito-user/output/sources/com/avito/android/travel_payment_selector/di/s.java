package com.avito.android.travel_payment_selector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSelectorModule_ProvideSimpleRecyclerAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302632a;

    /* renamed from: b, reason: collision with root package name */
    public final u f302633b;

    public s(g gVar, u uVar) {
        this.f302632a = gVar;
        this.f302633b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f302633b.get();
        this.f302632a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
