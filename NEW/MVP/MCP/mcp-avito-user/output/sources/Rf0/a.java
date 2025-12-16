package RF0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateOption.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/a;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f14204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f14205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f14206c;

    public a(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.f14204a = str;
        this.f14205b = str2;
        this.f14206c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f14204a, aVar.f14204a) && L.f(this.f14205b, aVar.f14205b) && L.f(this.f14206c, aVar.f14206c);
    }

    public final int hashCode() {
        int iHashCode = this.f14204a.hashCode() * 31;
        String str = this.f14205b;
        return this.f14206c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateRangeFormat(start=");
        sb2.append(this.f14204a);
        sb2.append(", end=");
        sb2.append(this.f14205b);
        sb2.append(", format=");
        return C22026a.c(sb2, this.f14206c, ')');
    }
}
