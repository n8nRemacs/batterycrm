package com.avito.android.hotel_booking.konveyor.installments;

import Y61.k;
import Y61.l;
import com.avito.android.travel_payment_methods.items.loan_terms.LoanTermsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormInstallmentsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/installments/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LoanTermsItem f163704c;

    public c(@l String str, @k LoanTermsItem loanTermsItem) {
        this.f163703b = str;
        this.f163704c = loanTermsItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f163703b, cVar.f163703b) && this.f163704c.equals(cVar.f163704c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return 889824469;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF302493b() {
        return "installmentsId";
    }

    public final int hashCode() {
        String str = this.f163703b;
        return this.f163704c.hashCode() + ((1814754763 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "BookingFormInstallmentsItem(stringId=installmentsId, parameterId=" + this.f163703b + ", loanTermsItem=" + this.f163704c + ')';
    }
}
