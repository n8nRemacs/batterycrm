package X80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/h;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PositionInfoPeriod.d.c f18705b;

    public h(boolean z12, @Y61.k PositionInfoPeriod.d.c cVar) {
        this.f18704a = z12;
        this.f18705b = cVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18704a == hVar.f18704a && L.f(this.f18705b, hVar.f18705b);
    }

    public final int hashCode() {
        return this.f18705b.hashCode() + (Boolean.hashCode(this.f18704a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PeriodInfoQueriesItemBlock(isExpanded=" + this.f18704a + ", query=" + this.f18705b + ')';
    }
}
