package Jz0;

import Y61.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersCalendarBookingsPostResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LJz0/a;", "", "", "bookingIdCursor", "", "", "LJz0/b;", "bookings", "", "total", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14268a {

    @com.google.gson.annotations.c("bookingIdCursor")
    @l
    private final String bookingIdCursor;

    @com.google.gson.annotations.c("bookings")
    @l
    private final Map<String, List<C14269b>> bookings;

    @com.google.gson.annotations.c("total")
    @l
    private final Long total;

    /* JADX WARN: Multi-variable type inference failed */
    public C14268a(@l String str, @l Map<String, ? extends List<C14269b>> map, @l Long l12) {
        this.bookingIdCursor = str;
        this.bookings = map;
        this.total = l12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getBookingIdCursor() {
        return this.bookingIdCursor;
    }

    @l
    public final Map<String, List<C14269b>> b() {
        return this.bookings;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getTotal() {
        return this.total;
    }
}
