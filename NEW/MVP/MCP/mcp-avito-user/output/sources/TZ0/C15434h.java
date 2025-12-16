package Tz0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.models.api.DateRange;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarBookingsResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/h;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15434h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16059a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DateRange f16060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f16061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f16062d;

    public C15434h(@Y61.k String str, @Y61.k DateRange dateRange, @Y61.k DeepLink deepLink, @Y61.k l lVar) {
        this.f16059a = str;
        this.f16060b = dateRange;
        this.f16061c = deepLink;
        this.f16062d = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15434h)) {
            return false;
        }
        C15434h c15434h = (C15434h) obj;
        return L.f(this.f16059a, c15434h.f16059a) && L.f(this.f16060b, c15434h.f16060b) && L.f(this.f16061c, c15434h.f16061c) && L.f(this.f16062d, c15434h.f16062d);
    }

    public final int hashCode() {
        return this.f16062d.hashCode() + com.avito.android.actions_sheet.a.e(this.f16061c, (this.f16060b.hashCode() + (this.f16059a.hashCode() * 31)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "StrOrdersCalendarOrderItem(bookingId=" + this.f16059a + ", dateRange=" + this.f16060b + ", deeplink=" + this.f16061c + ", tagInfo=" + this.f16062d + ')';
    }
}
