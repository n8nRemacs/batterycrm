package Tz0;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/c;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15429c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16041a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16042b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16043c;

    public C15429c(boolean z12, boolean z13, boolean z14) {
        this.f16041a = z12;
        this.f16042b = z13;
        this.f16043c = z14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15429c)) {
            return false;
        }
        C15429c c15429c = (C15429c) obj;
        return this.f16041a == c15429c.f16041a && this.f16042b == c15429c.f16042b && this.f16043c == c15429c.f16043c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16043c) + r.i(Boolean.hashCode(this.f16041a) * 31, 31, this.f16042b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarDateFeatures(hasInstantBooking=");
        sb2.append(this.f16041a);
        sb2.append(", hasLastMinuteOffer=");
        sb2.append(this.f16042b);
        sb2.append(", hasPromo=");
        return r.x(sb2, this.f16043c, ')');
    }
}
