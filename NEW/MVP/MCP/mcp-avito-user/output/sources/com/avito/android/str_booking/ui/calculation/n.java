package com.avito.android.str_booking.ui.calculation;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/n;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f285989a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f285990b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.l String str, @Y61.k List<? extends com.avito.conveyor_item.a> list) {
        this.f285989a = str;
        this.f285990b = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f285989a, nVar.f285989a) && L.f(this.f285990b, nVar.f285990b);
    }

    public final int hashCode() {
        String str = this.f285989a;
        return this.f285990b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TermsDetailsContent(title=");
        sb2.append(this.f285989a);
        sb2.append(", content=");
        return H.p(sb2, this.f285990b, ')');
    }
}
