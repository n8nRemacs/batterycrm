package vy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingCalendarItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvy0/a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49398a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f441057a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441058b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DateRange f441059c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f441060d;

    public C49398a(@k Date date, boolean z12, @l DateRange dateRange, @l String str) {
        this.f441057a = date;
        this.f441058b = z12;
        this.f441059c = dateRange;
        this.f441060d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49398a)) {
            return false;
        }
        C49398a c49398a = (C49398a) obj;
        return L.f(this.f441057a, c49398a.f441057a) && this.f441058b == c49398a.f441058b && L.f(this.f441059c, c49398a.f441059c) && L.f(this.f441060d, c49398a.f441060d);
    }

    public final int hashCode() {
        int i12 = r.i(this.f441057a.hashCode() * 31, 31, this.f441058b);
        DateRange dateRange = this.f441059c;
        int iHashCode = (i12 + (dateRange == null ? 0 : dateRange.hashCode())) * 31;
        String str = this.f441060d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingCalendarItem(date=");
        sb2.append(this.f441057a);
        sb2.append(", isCheckInAvailable=");
        sb2.append(this.f441058b);
        sb2.append(", availableCheckOutDateRange=");
        sb2.append(this.f441059c);
        sb2.append(", minimalDurationCaption=");
        return C22026a.c(sb2, this.f441060d, ')');
    }
}
