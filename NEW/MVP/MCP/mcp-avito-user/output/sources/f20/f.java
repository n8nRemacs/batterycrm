package F20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MultiSendContentData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/f;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final double f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4524b;

    public f(double d12, long j12) {
        this.f4523a = d12;
        this.f4524b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(this.f4523a, fVar.f4523a) == 0 && this.f4524b == fVar.f4524b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4524b) + (Double.hashCode(this.f4523a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSendSellerReputationData(rating=");
        sb2.append(this.f4523a);
        sb2.append(", reviewCount=");
        return r.u(sb2, this.f4524b, ')');
    }
}
