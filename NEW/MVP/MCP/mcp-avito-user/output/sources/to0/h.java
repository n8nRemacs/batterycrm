package To0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/h;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15919b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15920c;

    public h(@k Date date, long j12, long j13) {
        this.f15918a = date;
        this.f15919b = j12;
        this.f15920c = j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f15918a, hVar.f15918a) && this.f15919b == hVar.f15919b && this.f15920c == hVar.f15920c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15920c) + r.g(this.f15918a.hashCode() * 31, 31, this.f15919b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tariff(dueDate=");
        sb2.append(this.f15918a);
        sb2.append(", totalSends=");
        sb2.append(this.f15919b);
        sb2.append(", sendsLeft=");
        return r.u(sb2, this.f15920c, ')');
    }
}
