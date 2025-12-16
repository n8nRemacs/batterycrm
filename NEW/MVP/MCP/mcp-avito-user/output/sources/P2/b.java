package P2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarMonth.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"LP2/b;", "", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class b implements Comparable<b> {

    /* renamed from: b, reason: collision with root package name */
    public final int f12787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12789d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12790e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12791f;

    public b(int i12, int i13, int i14, int i15, long j12) {
        this.f12787b = i12;
        this.f12788c = i13;
        this.f12789d = i14;
        this.f12790e = i15;
        this.f12791f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        int iG2 = L.g(this.f12787b, bVar2.f12787b);
        return iG2 != 0 ? iG2 : L.g(this.f12788c, bVar2.f12788c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12787b == bVar.f12787b && this.f12788c == bVar.f12788c && this.f12789d == bVar.f12789d && this.f12790e == bVar.f12790e && this.f12791f == bVar.f12791f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12791f) + r.e(this.f12790e, r.e(this.f12789d, r.e(this.f12788c, Integer.hashCode(this.f12787b) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(year=");
        sb2.append(this.f12787b);
        sb2.append(", month=");
        sb2.append(this.f12788c);
        sb2.append(", numberOfDays=");
        sb2.append(this.f12789d);
        sb2.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb2.append(this.f12790e);
        sb2.append(", startUtcTimeMillis=");
        return r.u(sb2, this.f12791f, ')');
    }
}
