package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.short_term_rent.bookingform.di.c;
import com.avito.android.short_term_rent.bookingform.di.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_PageContentModule_KonveyorModule_ProvideLoanTermsBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.loan_terms.b> f281245a;

    /* renamed from: b, reason: collision with root package name */
    public final i f281246b;

    public h(Provider provider, i iVar) {
        this.f281245a = provider;
        this.f281246b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.loan_terms.c cVarPa = ((p.b.f) this.f281245a).f281315a.pa();
        com.avito.android.travel_payment_methods.items.loan_terms.j jVar = (com.avito.android.travel_payment_methods.items.loan_terms.j) this.f281246b.get();
        c.InterfaceC8378c.a.f281239a.getClass();
        return cVarPa.a(jVar);
    }
}
