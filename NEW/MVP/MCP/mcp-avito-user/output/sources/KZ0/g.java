package Kz0;

import kotlin.Metadata;

/* compiled from: Api3StrSellerOrdersCalendarPostResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LKz0/g;", "", "", "instantBooking", "lastMinuteOffer", "promo", "<init>", "(ZZZ)V", "Z", "a", "()Z", "b", "c", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("instantBooking")
    private final boolean instantBooking;

    @com.google.gson.annotations.c("lastMinuteOffer")
    private final boolean lastMinuteOffer;

    @com.google.gson.annotations.c("promo")
    private final boolean promo;

    public g(boolean z12, boolean z13, boolean z14) {
        this.instantBooking = z12;
        this.lastMinuteOffer = z13;
        this.promo = z14;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getInstantBooking() {
        return this.instantBooking;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getLastMinuteOffer() {
        return this.lastMinuteOffer;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPromo() {
        return this.promo;
    }
}
