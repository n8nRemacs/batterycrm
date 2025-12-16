package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_selector.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvidePaymentMethodBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<com.avito.android.travel_payment_methods.items.payment_method.a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302617a;

    /* renamed from: b, reason: collision with root package name */
    public final u f302618b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.payment_method.b> f302619c;

    public o(g gVar, u uVar, Provider provider) {
        this.f302617a = gVar;
        this.f302618b = uVar;
        this.f302619c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.payment_method.g gVar = (com.avito.android.travel_payment_methods.items.payment_method.g) this.f302618b.get();
        com.avito.android.travel_payment_methods.items.payment_method.c cVarHk = ((a.c.g) this.f302619c).f302597a.hk();
        this.f302617a.getClass();
        return cVarHk.a(gVar);
    }
}
