package To0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/g;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15917c;

    public g(@k String str, @k String str2, @k String str3) {
        this.f15915a = str;
        this.f15916b = str2;
        this.f15917c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f15915a, gVar.f15915a) && L.f(this.f15916b, gVar.f15916b) && L.f(this.f15917c, gVar.f15917c);
    }

    public final int hashCode() {
        return this.f15917c.hashCode() + H.d(this.f15915a.hashCode() * 31, 31, this.f15916b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewTitle(step1=");
        sb2.append(this.f15915a);
        sb2.append(", step2=");
        sb2.append(this.f15916b);
        sb2.append(", step3=");
        return C22026a.c(sb2, this.f15917c, ')');
    }
}
