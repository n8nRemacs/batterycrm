package z10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferDynamicDescription.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/g;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443795a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f443796b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f443797c;

    public g(@k String str, @k String str2, @l String str3) {
        this.f443795a = str;
        this.f443796b = str2;
        this.f443797c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f443795a, gVar.f443795a) && L.f(this.f443796b, gVar.f443796b) && L.f(this.f443797c, gVar.f443797c);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f443795a.hashCode() * 31, 31, this.f443796b);
        String str = this.f443797c;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentOfferDescription(title=");
        sb2.append(this.f443795a);
        sb2.append(", value=");
        sb2.append(this.f443796b);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f443797c, ')');
    }
}
