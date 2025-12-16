package com.avito.android.travel_payment_selector.di;

import com.avito.android.travel_payment_methods.items.loan_terms.k;
import com.avito.android.travel_payment_selector.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvideLoanTermsPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<com.avito.android.travel_payment_methods.items.loan_terms.j<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302614a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f302615b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.loan_terms.k> f302616c;

    public n(g gVar, dagger.internal.l lVar, Provider provider) {
        this.f302614a = gVar;
        this.f302615b = lVar;
        this.f302616c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f302615b.f393949a;
        com.avito.android.travel_payment_methods.items.loan_terms.o oVarX6 = ((a.c.f) this.f302616c).f302596a.x6();
        this.f302614a.getClass();
        return k.a.a(oVarX6, new h(lVar), new i(lVar), 4);
    }
}
