package Tz0;

import com.akita.compose.component.accordion.s;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarBookingsResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/a;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15427a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f16034a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f16035b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f16036c;

    public C15427a(@Y61.l Integer num, @Y61.l String str, @Y61.k LinkedHashMap linkedHashMap) {
        this.f16034a = str;
        this.f16035b = linkedHashMap;
        this.f16036c = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15427a)) {
            return false;
        }
        C15427a c15427a = (C15427a) obj;
        return L.f(this.f16034a, c15427a.f16034a) && this.f16035b.equals(c15427a.f16035b) && L.f(this.f16036c, c15427a.f16036c);
    }

    public final int hashCode() {
        String str = this.f16034a;
        int iHashCode = (this.f16035b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Integer num = this.f16036c;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarBookingsResponse(bookingIdCursor=");
        sb2.append(this.f16034a);
        sb2.append(", bookings=");
        sb2.append(this.f16035b);
        sb2.append(", total=");
        return s.j(sb2, this.f16036c, ')');
    }
}
