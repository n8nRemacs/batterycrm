package MF0;

import Y61.k;
import Y61.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMF0/b;", "", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Float f10503a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LocalDate f10504b;

    public b(@l Float f12, @l LocalDate localDate) {
        this.f10503a = f12;
        this.f10504b = localDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f10503a, bVar.f10503a) && L.f(this.f10504b, bVar.f10504b);
    }

    public final int hashCode() {
        Float f12 = this.f10503a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        LocalDate localDate = this.f10504b;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureInputState(commission=");
        sb2.append(this.f10503a);
        sb2.append(", date=");
        return AK.c.t(sb2, this.f10504b, ')');
    }
}
