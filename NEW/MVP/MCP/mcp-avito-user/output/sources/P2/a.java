package P2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDate.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"LP2/a;", "", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements Comparable<a> {

    /* renamed from: b, reason: collision with root package name */
    public final int f12783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12784c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12785d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12786e;

    public a(int i12, int i13, long j12, int i14) {
        this.f12783b = i12;
        this.f12784c = i13;
        this.f12785d = i14;
        this.f12786e = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return L.h(this.f12786e, aVar.f12786e);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12783b == aVar.f12783b && this.f12784c == aVar.f12784c && this.f12785d == aVar.f12785d && this.f12786e == aVar.f12786e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12786e) + r.e(this.f12785d, r.e(this.f12784c, Integer.hashCode(this.f12783b) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarDate(year=");
        sb2.append(this.f12783b);
        sb2.append(", month=");
        sb2.append(this.f12784c);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f12785d);
        sb2.append(", utcTimeMillis=");
        return r.u(sb2, this.f12786e, ')');
    }
}
