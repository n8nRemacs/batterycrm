package pw0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethodsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/h;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f428877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f428879c;

    public h(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f428877a = str;
        this.f428878b = str2;
        this.f428879c = str3;
    }

    public static h a(h hVar, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = hVar.f428877a;
        }
        if ((i12 & 2) != 0) {
            str2 = hVar.f428878b;
        }
        String str3 = hVar.f428879c;
        hVar.getClass();
        return new h(str, str2, str3);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f428877a, hVar.f428877a) && L.f(this.f428878b, hVar.f428878b) && L.f(this.f428879c, hVar.f428879c);
    }

    public final int hashCode() {
        String str = this.f428877a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f428878b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f428879c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentMethodsData(paymentType=");
        sb2.append(this.f428877a);
        sb2.append(", paymentPlan=");
        sb2.append(this.f428878b);
        sb2.append(", paymentScenarios=");
        return C22026a.c(sb2, this.f428879c, ')');
    }
}
