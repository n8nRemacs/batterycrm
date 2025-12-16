package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.short_term_rent.bookingform.di.c;
import com.avito.android.short_term_rent.bookingform.di.p;
import com.avito.android.travel_payment_methods.items.loan_terms.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_PageContentModule_KonveyorModule_ProvideLoanTermsPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.android.travel_payment_methods.items.loan_terms.j<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.loan_terms.k> f281247a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f281248b;

    public i(dagger.internal.l lVar, Provider provider) {
        this.f281247a = provider;
        this.f281248b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.loan_terms.o oVarX6 = ((p.b.g) this.f281247a).f281316a.x6();
        Y41.l lVar = (Y41.l) this.f281248b.f393949a;
        c.InterfaceC8378c.a.f281239a.getClass();
        return k.a.a(oVarX6, new d(lVar), new e(lVar), 4);
    }
}
