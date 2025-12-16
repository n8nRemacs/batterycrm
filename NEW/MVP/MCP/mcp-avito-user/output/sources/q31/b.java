package Q31;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Date.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQ31/b;", "", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class b implements Comparable<b> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13451d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WeekDay f13452e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13453f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13454g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Month f13455h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13456i;

    /* renamed from: j, reason: collision with root package name */
    public final long f13457j;

    /* compiled from: Date.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ31/b$a;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        io.ktor.util.date.a.b(0L);
    }

    public b(int i12, int i13, int i14, @k WeekDay weekDay, int i15, int i16, @k Month month, int i17, long j12) {
        this.f13449b = i12;
        this.f13450c = i13;
        this.f13451d = i14;
        this.f13452e = weekDay;
        this.f13453f = i15;
        this.f13454g = i16;
        this.f13455h = month;
        this.f13456i = i17;
        this.f13457j = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return L.h(this.f13457j, bVar.f13457j);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13449b == bVar.f13449b && this.f13450c == bVar.f13450c && this.f13451d == bVar.f13451d && this.f13452e == bVar.f13452e && this.f13453f == bVar.f13453f && this.f13454g == bVar.f13454g && this.f13455h == bVar.f13455h && this.f13456i == bVar.f13456i && this.f13457j == bVar.f13457j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13457j) + r.e(this.f13456i, (this.f13455h.hashCode() + r.e(this.f13454g, r.e(this.f13453f, (this.f13452e.hashCode() + r.e(this.f13451d, r.e(this.f13450c, Integer.hashCode(this.f13449b) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GMTDate(seconds=");
        sb2.append(this.f13449b);
        sb2.append(", minutes=");
        sb2.append(this.f13450c);
        sb2.append(", hours=");
        sb2.append(this.f13451d);
        sb2.append(", dayOfWeek=");
        sb2.append(this.f13452e);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f13453f);
        sb2.append(", dayOfYear=");
        sb2.append(this.f13454g);
        sb2.append(", month=");
        sb2.append(this.f13455h);
        sb2.append(", year=");
        sb2.append(this.f13456i);
        sb2.append(", timestamp=");
        return r.u(sb2, this.f13457j, ')');
    }
}
