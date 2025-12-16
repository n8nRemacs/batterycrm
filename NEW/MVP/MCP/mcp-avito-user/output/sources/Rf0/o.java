package RF0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoValueRangeColors.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/o;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f14254a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f14255b;

    public o(@Y61.k String str, @Y61.k String str2) {
        this.f14254a = str;
        this.f14255b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f14254a, oVar.f14254a) && L.f(this.f14255b, oVar.f14255b);
    }

    public final int hashCode() {
        return this.f14255b.hashCode() + (this.f14254a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoValueRangeColors(sliderColorName=");
        sb2.append(this.f14254a);
        sb2.append(", descriptionColorName=");
        return C22026a.c(sb2, this.f14255b, ')');
    }
}
