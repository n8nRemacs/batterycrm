package com.avito.android.hotel_booking.konveyor.installments;

import Y41.l;
import Y61.k;
import com.avito.android.travel_payment_methods.items.loan_terms.LoanTermsItem;
import com.avito.android.travel_payment_methods.items.loan_terms.j;
import com.avito.android.travel_payment_methods.items.loan_terms.u;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BookingFormInstallmentsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/installments/g;", "LTV0/f;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/u;", "Lcom/avito/android/hotel_booking/konveyor/installments/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements TV0.f<u, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RI.b, G0> f163710b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j<u, LoanTermsItem> f163711c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super RI.b, G0> lVar, @k j<u, LoanTermsItem> jVar) {
        this.f163710b = lVar;
        this.f163711c = jVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) aVar;
        d dVar = new d(this, cVar);
        j<u, LoanTermsItem> jVar = this.f163711c;
        jVar.e6(dVar);
        jVar.d7(new e(this, cVar));
        jVar.g1(new f(this));
        jVar.O5((u) eVar, cVar.f163704c, i12);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        c cVar = (c) aVar;
        d dVar = new d(this, cVar);
        j<u, LoanTermsItem> jVar = this.f163711c;
        jVar.e6(dVar);
        jVar.d7(new e(this, cVar));
        jVar.g1(new f(this));
        jVar.g2((u) eVar, cVar.f163704c, i12, list);
    }
}
