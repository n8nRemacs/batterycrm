package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@InterfaceC21537e7
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/p2;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C21784p2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f37010a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37013d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37014e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37015f;

    public C21784p2(int i12, int i13, int i14, int i15, long j12) {
        this.f37010a = i12;
        this.f37011b = i13;
        this.f37012c = i14;
        this.f37013d = i15;
        this.f37014e = j12;
        this.f37015f = ((i14 * 86400000) + j12) - 1;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21784p2)) {
            return false;
        }
        C21784p2 c21784p2 = (C21784p2) obj;
        return this.f37010a == c21784p2.f37010a && this.f37011b == c21784p2.f37011b && this.f37012c == c21784p2.f37012c && this.f37013d == c21784p2.f37013d && this.f37014e == c21784p2.f37014e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37014e) + androidx.appcompat.app.r.e(this.f37013d, androidx.appcompat.app.r.e(this.f37012c, androidx.appcompat.app.r.e(this.f37011b, Integer.hashCode(this.f37010a) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(year=");
        sb2.append(this.f37010a);
        sb2.append(", month=");
        sb2.append(this.f37011b);
        sb2.append(", numberOfDays=");
        sb2.append(this.f37012c);
        sb2.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb2.append(this.f37013d);
        sb2.append(", startUtcTimeMillis=");
        return androidx.appcompat.app.r.u(sb2, this.f37014e, ')');
    }
}
