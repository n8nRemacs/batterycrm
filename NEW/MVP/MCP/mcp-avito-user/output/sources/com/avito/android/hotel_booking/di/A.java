package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.di.C30781b;
import com.avito.android.travel_payment_methods.items.loan_terms.LoanTermsItem;
import com.avito.android.travel_payment_methods.items.loan_terms.k;
import javax.inject.Provider;

/* compiled from: HotelBookingFormAdapterModule_ProvideLoanTermsPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<com.avito.android.travel_payment_methods.items.loan_terms.j<com.avito.android.travel_payment_methods.items.loan_terms.u, LoanTermsItem>> {

    /* renamed from: a, reason: collision with root package name */
    public final w f163337a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.loan_terms.k> f163338b;

    public A(w wVar, Provider<com.avito.android.travel_payment_methods.items.loan_terms.k> provider) {
        this.f163337a = wVar;
        this.f163338b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.loan_terms.o oVarX6 = ((C30781b.c.e) this.f163338b).f163419a.x6();
        this.f163337a.getClass();
        return k.a.a(oVarX6, null, null, 7);
    }
}
