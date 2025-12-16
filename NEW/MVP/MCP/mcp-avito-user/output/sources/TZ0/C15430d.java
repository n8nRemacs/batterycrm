package Tz0;

import androidx.compose.runtime.C22026a;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.models.api.DateRange;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/d;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15430d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DateRange f16044a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16045b;

    public C15430d(@Y61.k DateRange dateRange, @Y61.k String str) {
        this.f16044a = dateRange;
        this.f16045b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15430d)) {
            return false;
        }
        C15430d c15430d = (C15430d) obj;
        return L.f(this.f16044a, c15430d.f16044a) && L.f(this.f16045b, c15430d.f16045b);
    }

    public final int hashCode() {
        return this.f16045b.hashCode() + (this.f16044a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarDisabledInterval(dateRange=");
        sb2.append(this.f16044a);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f16045b, ')');
    }
}
