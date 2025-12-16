package com.avito.android.hotel_booking.konveyor.installments;

import com.avito.android.travel_payment_methods.items.loan_terms.v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormInstallmentsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f163701a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<v> f163702b;

    public b(h hVar, Provider provider) {
        this.f163701a = hVar;
        this.f163702b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f163701a.get(), this.f163702b.get());
    }
}
