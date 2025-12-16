package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.short_term_rent.bookingform.di.c;
import com.avito.android.short_term_rent.bookingform.di.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_PageContentModule_KonveyorModule_ProvidePaymentMethodBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_payment_methods.items.payment_method.b> f281249a;

    /* renamed from: b, reason: collision with root package name */
    public final k f281250b;

    public j(Provider provider, k kVar) {
        this.f281249a = provider;
        this.f281250b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_payment_methods.items.payment_method.c cVarHk = ((p.b.h) this.f281249a).f281317a.hk();
        com.avito.android.travel_payment_methods.items.payment_method.g gVar = (com.avito.android.travel_payment_methods.items.payment_method.g) this.f281250b.get();
        c.InterfaceC8378c.a.f281239a.getClass();
        return cVarHk.a(gVar);
    }
}
