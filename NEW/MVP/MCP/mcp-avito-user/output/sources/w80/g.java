package W80;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/g;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17794a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<f> f17795b;

    public g(@k String str, @k List<f> list) {
        this.f17794a = str;
        this.f17795b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f17794a, gVar.f17794a) && L.f(this.f17795b, gVar.f17795b);
    }

    public final int hashCode() {
        return this.f17795b.hashCode() + (this.f17794a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionInfoPeriodsBlock(blockId=");
        sb2.append(this.f17794a);
        sb2.append(", periods=");
        return H.p(sb2, this.f17795b, ')');
    }
}
