package K6;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalaryRangeState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK6/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9270a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9271b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9272c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9273d;

    public a(@k String str, long j12, long j13, long j14) {
        this.f9270a = str;
        this.f9271b = j12;
        this.f9272c = j13;
        this.f9273d = j14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9270a, aVar.f9270a) && this.f9271b == aVar.f9271b && this.f9272c == aVar.f9272c && this.f9273d == aVar.f9273d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9273d) + r.g(r.g(this.f9270a.hashCode() * 31, 31, this.f9271b), 31, this.f9272c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SalaryRangeState(displaySalary=");
        sb2.append(this.f9270a);
        sb2.append(", middleSalary=");
        sb2.append(this.f9271b);
        sb2.append(", rangeFrom=");
        sb2.append(this.f9272c);
        sb2.append(", rangeTo=");
        return r.u(sb2, this.f9273d, ')');
    }
}
