package sH;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/d;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437576a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<g> f437577b;

    public d(@k String str, @k List<g> list) {
        this.f437576a = str;
        this.f437577b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f437576a, dVar.f437576a) && L.f(this.f437577b, dVar.f437577b);
    }

    public final int hashCode() {
        return this.f437577b.hashCode() + (this.f437576a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentDetails(title=");
        sb2.append(this.f437576a);
        sb2.append(", items=");
        return H.p(sb2, this.f437577b, ')');
    }
}
