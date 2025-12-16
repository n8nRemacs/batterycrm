package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideDiffCalculator$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f214646a;

    public p(dagger.internal.u uVar) {
        this.f214646a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.g gVar = (com.avito.android.payment.g) this.f214646a.get();
        int i12 = d.b.f214621a;
        return new com.avito.android.recycler.data_aware.i(gVar, new com.avito.android.recycler.data_aware.j(), true, null, 8, null);
    }
}
