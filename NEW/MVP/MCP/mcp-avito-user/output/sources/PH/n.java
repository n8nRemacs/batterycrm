package pH;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/n;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    public final double f428413a;

    /* renamed from: b, reason: collision with root package name */
    public final double f428414b;

    public n(double d12, double d13) {
        this.f428413a = d12;
        this.f428414b = d13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Double.compare(this.f428413a, nVar.f428413a) == 0 && Double.compare(this.f428414b, nVar.f428414b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f428414b) + (Double.hashCode(this.f428413a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigSlotMapViewCoords(lat=");
        sb2.append(this.f428413a);
        sb2.append(", lng=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f428414b, ')');
    }
}
