package y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: InputItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/f;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f442854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f442855b;

    public f(long j12, long j13) {
        this.f442854a = j12;
        this.f442855b = j13;
    }

    public final long a(long j12) {
        long j13 = this.f442855b;
        if (j12 <= j13) {
            j13 = this.f442854a;
            if (j12 >= j13) {
                return j12;
            }
        }
        return j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f442854a == fVar.f442854a && this.f442855b == fVar.f442855b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f442855b) + (Long.hashCode(this.f442854a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValueLimits(min=");
        sb2.append(this.f442854a);
        sb2.append(", max=");
        return r.u(sb2, this.f442855b, ')');
    }
}
