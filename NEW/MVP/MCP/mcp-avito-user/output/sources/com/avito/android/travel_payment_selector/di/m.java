package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_methods.items.loan_terms.InterfaceC35262a;
import com.avito.android.travel_payment_selector.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvideLoanTermsBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<InterfaceC35262a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302611a;

    /* renamed from: b, reason: collision with root package name */
    public final u f302612b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.loan_terms.b> f302613c;

    public m(g gVar, u uVar, Provider provider) {
        this.f302611a = gVar;
        this.f302612b = uVar;
        this.f302613c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.loan_terms.j jVar = (com.avito.android.travel_payment_methods.items.loan_terms.j) this.f302612b.get();
        com.avito.android.travel_payment_methods.items.loan_terms.c cVarPa = ((a.c.e) this.f302613c).f302595a.pa();
        this.f302611a.getClass();
        return cVarPa.a(jVar);
    }
}
