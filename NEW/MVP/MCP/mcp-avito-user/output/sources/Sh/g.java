package sH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/g;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437586a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437587b;

    public g(@k String str, @k String str2) {
        this.f437586a = str;
        this.f437587b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f437586a, gVar.f437586a) && L.f(this.f437587b, gVar.f437587b);
    }

    public final int hashCode() {
        return this.f437587b.hashCode() + (this.f437586a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentOption(leftText=");
        sb2.append(this.f437586a);
        sb2.append(", rightText=");
        return C22026a.c(sb2, this.f437587b, ')');
    }
}
