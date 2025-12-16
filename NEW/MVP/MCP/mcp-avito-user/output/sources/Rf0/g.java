package RF0;

import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoIcon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/g;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f14237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final l f14238b;

    public g(@InterfaceC42150f int i12, @Y61.l l lVar) {
        this.f14237a = i12;
        this.f14238b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14237a == gVar.f14237a && L.f(this.f14238b, gVar.f14238b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f14237a) * 31;
        l lVar = this.f14238b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "TrxPromoIcon(iconAttr=" + this.f14237a + ", iconColor=" + this.f14238b + ')';
    }
}
