package com.avito.android.hotel_booking.konveyor.installments;

import com.avito.android.travel_payment_methods.items.loan_terms.j;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormInstallmentsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f163712a;

    /* renamed from: b, reason: collision with root package name */
    public final u f163713b;

    public h(l lVar, u uVar) {
        this.f163712a = lVar;
        this.f163713b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f163712a.f393949a, (j) this.f163713b.get());
    }
}
