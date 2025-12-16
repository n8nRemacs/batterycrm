package EO;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEO/d;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f4007a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.conveyor_item.a> list) {
        this.f4007a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f4007a, ((d) obj).f4007a);
    }

    public final int hashCode() {
        return this.f4007a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("ItemPriceHistoryViewState(items="), this.f4007a, ')');
    }
}
