package V80;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoPeriodRequest.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/i;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f16973a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16974b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f16975c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PositionInfoPeriodAction f16976d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f16977e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final PeriodSortDirection f16978f;

    public i(long j12, @Y61.k String str, @Y61.l Long l12, @Y61.k PositionInfoPeriodAction positionInfoPeriodAction, @Y61.l String str2, @Y61.l PeriodSortDirection periodSortDirection) {
        this.f16973a = j12;
        this.f16974b = str;
        this.f16975c = l12;
        this.f16976d = positionInfoPeriodAction;
        this.f16977e = str2;
        this.f16978f = periodSortDirection;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f16973a == iVar.f16973a && L.f(this.f16974b, iVar.f16974b) && L.f(this.f16975c, iVar.f16975c) && this.f16976d == iVar.f16976d && L.f(this.f16977e, iVar.f16977e) && this.f16978f == iVar.f16978f;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f16973a) * 31, 31, this.f16974b);
        Long l12 = this.f16975c;
        int iHashCode = (this.f16976d.hashCode() + ((iD2 + (l12 == null ? 0 : l12.hashCode())) * 31)) * 31;
        String str = this.f16977e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PeriodSortDirection periodSortDirection = this.f16978f;
        return iHashCode2 + (periodSortDirection != null ? periodSortDirection.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PositionInfoPeriodRequest(itemId=" + this.f16973a + ", period=" + this.f16974b + ", offset=" + this.f16975c + ", actionType=" + this.f16976d + ", sort=" + this.f16977e + ", sortDirection=" + this.f16978f + ')';
    }
}
