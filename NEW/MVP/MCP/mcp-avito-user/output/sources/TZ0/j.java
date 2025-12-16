package Tz0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/j;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16065a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f16066b;

    public j(@Y61.k String str, @Y61.l String str2) {
        this.f16065a = str;
        this.f16066b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f16065a, jVar.f16065a) && L.f(this.f16066b, jVar.f16066b);
    }

    public final int hashCode() {
        int iHashCode = this.f16065a.hashCode() * 31;
        String str = this.f16066b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarPriceInfo(mainPrice=");
        sb2.append(this.f16065a);
        sb2.append(", extraPrice=");
        return C22026a.c(sb2, this.f16066b, ')');
    }
}
