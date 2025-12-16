package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@InterfaceC21537e7
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/k2;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C21669k2 implements Comparable<C21669k2> {

    /* renamed from: b, reason: collision with root package name */
    public final int f36699b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36701d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36702e;

    public C21669k2(int i12, int i13, long j12, int i14) {
        this.f36699b = i12;
        this.f36700c = i13;
        this.f36701d = i14;
        this.f36702e = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21669k2 c21669k2) {
        return kotlin.jvm.internal.L.h(this.f36702e, c21669k2.f36702e);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21669k2)) {
            return false;
        }
        C21669k2 c21669k2 = (C21669k2) obj;
        return this.f36699b == c21669k2.f36699b && this.f36700c == c21669k2.f36700c && this.f36701d == c21669k2.f36701d && this.f36702e == c21669k2.f36702e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36702e) + androidx.appcompat.app.r.e(this.f36701d, androidx.appcompat.app.r.e(this.f36700c, Integer.hashCode(this.f36699b) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarDate(year=");
        sb2.append(this.f36699b);
        sb2.append(", month=");
        sb2.append(this.f36700c);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f36701d);
        sb2.append(", utcTimeMillis=");
        return androidx.appcompat.app.r.u(sb2, this.f36702e, ')');
    }
}
