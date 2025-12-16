package oy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loy0/c;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oy0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44958c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f422380a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f422381b;

    public C44958c(@k ArrayList arrayList, @k Date date) {
        this.f422380a = date;
        this.f422381b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44958c)) {
            return false;
        }
        C44958c c44958c = (C44958c) obj;
        return L.f(this.f422380a, c44958c.f422380a) && this.f422381b.equals(c44958c.f422381b);
    }

    public final int hashCode() {
        return this.f422381b.hashCode() + (this.f422380a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingCalendarMonthInfo(firstDayDate=");
        sb2.append(this.f422380a);
        sb2.append(", days=");
        return e.p(sb2, this.f422381b, ')');
    }
}
