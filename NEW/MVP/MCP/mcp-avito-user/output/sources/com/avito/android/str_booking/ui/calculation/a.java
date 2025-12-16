package com.avito.android.str_booking.ui.calculation;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/a;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f285951a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<AttributedText> f285952b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f285953c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.l String str, @Y61.k List<AttributedText> list, @Y61.k List<? extends com.avito.conveyor_item.a> list2) {
        this.f285951a = str;
        this.f285952b = list;
        this.f285953c = list2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f285951a, aVar.f285951a) && L.f(this.f285952b, aVar.f285952b) && L.f(this.f285953c, aVar.f285953c);
    }

    public final int hashCode() {
        String str = this.f285951a;
        return this.f285953c.hashCode() + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f285952b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentDetailsContent(title=");
        sb2.append(this.f285951a);
        sb2.append(", headerInsights=");
        sb2.append(this.f285952b);
        sb2.append(", content=");
        return H.p(sb2, this.f285953c, ')');
    }
}
