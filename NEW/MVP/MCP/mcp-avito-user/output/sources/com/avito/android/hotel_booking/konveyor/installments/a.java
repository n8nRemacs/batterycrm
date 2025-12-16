package com.avito.android.hotel_booking.konveyor.installments;

import TV0.g;
import Y61.k;
import com.avito.android.travel_payment_methods.items.loan_terms.u;
import com.avito.android.travel_payment_methods.items.loan_terms.v;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BookingFormInstallmentsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/installments/a;", "LTV0/b;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/u;", "Lcom/avito/android/hotel_booking/konveyor/installments/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<u, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f163699a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f163700b;

    @Inject
    public a(@k g gVar, @k v vVar) {
        this.f163699a = gVar;
        this.f163700b = vVar.create();
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f163699a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f163700b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
