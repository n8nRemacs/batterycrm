package BO;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBO/a;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<b> f1373a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f1374b;

    public a(@k List<b> list, @l Integer num) {
        this.f1373a = list;
        this.f1374b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f1373a, aVar.f1373a) && L.f(this.f1374b, aVar.f1374b);
    }

    public final int hashCode() {
        int iHashCode = this.f1373a.hashCode() * 31;
        Integer num = this.f1374b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPriceHistoryData(items=");
        sb2.append(this.f1373a);
        sb2.append(", nextOffset=");
        return s.j(sb2, this.f1374b, ')');
    }
}
