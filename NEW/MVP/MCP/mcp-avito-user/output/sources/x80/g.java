package X80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/g;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f18702a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PositionInfoPeriod.d.a f18703b;

    public g(@Y61.k String str, @Y61.k PositionInfoPeriod.d.a aVar) {
        this.f18702a = str;
        this.f18703b = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f18702a, gVar.f18702a) && L.f(this.f18703b, gVar.f18703b);
    }

    public final int hashCode() {
        return this.f18703b.hashCode() + (this.f18702a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "PeriodInfoQueriesHeaderBlock(blockId=" + this.f18702a + ", header=" + this.f18703b + ')';
    }
}
