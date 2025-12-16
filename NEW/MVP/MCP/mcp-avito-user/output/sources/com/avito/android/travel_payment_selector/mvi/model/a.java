package com.avito.android.travel_payment_selector.mvi.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get.PaymentTypesResV2SuccessPaymentTypesItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentSelectorData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/model/a;", "", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f302696a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PaymentTypesResV2SuccessPaymentTypesItem> f302697b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f302698c;

    public a(long j12, @k List<PaymentTypesResV2SuccessPaymentTypesItem> list, @k AttributedText attributedText) {
        this.f302696a = j12;
        this.f302697b = list;
        this.f302698c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f302696a == aVar.f302696a && L.f(this.f302697b, aVar.f302697b) && L.f(this.f302698c, aVar.f302698c);
    }

    public final int hashCode() {
        return this.f302698c.hashCode() + H.e(Long.hashCode(this.f302696a) * 31, 31, this.f302697b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentSelectorData(defaultPaymentTypeIndex=");
        sb2.append(this.f302696a);
        sb2.append(", paymentTypes=");
        sb2.append(this.f302697b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f302698c, ')');
    }
}
