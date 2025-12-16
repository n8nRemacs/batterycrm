package RF0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoValueRange.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/n;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.l f14251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f14252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final o f14253c;

    public n(@Y61.k kotlin.ranges.l lVar, @Y61.l AttributedText attributedText, @Y61.l o oVar) {
        this.f14251a = lVar;
        this.f14252b = attributedText;
        this.f14253c = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f14251a, nVar.f14251a) && L.f(this.f14252b, nVar.f14252b) && L.f(this.f14253c, nVar.f14253c);
    }

    public final int hashCode() {
        int iHashCode = this.f14251a.hashCode() * 31;
        AttributedText attributedText = this.f14252b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        o oVar = this.f14253c;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TrxPromoValueRange(range=" + this.f14251a + ", description=" + this.f14252b + ", colors=" + this.f14253c + ')';
    }
}
