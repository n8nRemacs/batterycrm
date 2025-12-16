package com.avito.android.payment.lib.di;

import androidx.recyclerview.widget.C;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideDataAwareAdapterPresenter$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f214643a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f214644b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f214645c;

    public o(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f214643a = provider;
        this.f214644b = provider2;
        this.f214645c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f214643a);
        com.avito.konveyor.adapter.a aVar = this.f214644b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f214645c.get();
        int i12 = d.b.f214621a;
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
