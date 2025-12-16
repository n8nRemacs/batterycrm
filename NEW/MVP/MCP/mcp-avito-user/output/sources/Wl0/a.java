package WL0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessfulPlanEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWL0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_vas-planning_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17869b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17870c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f17871d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f17872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17873f;

    public a() {
        throw null;
    }

    public a(String str, String str2, List list, String str3, int i12, C42822w c42822w) {
        str3 = (i12 & 8) != 0 ? null : str3;
        this.f17869b = str;
        this.f17870c = str2;
        this.f17871d = list;
        this.f17872e = str3;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str2), new Q("plannedvas_ids", list == null ? C42784z0.f406748b : list));
        if (str3 != null) {
            linkedHashMapJ.put("strategy_id", str3);
        }
        G0 g02 = G0.f406611a;
        this.f17873f = new ParametrizedClickStreamEvent(5326, 4, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f17869b, aVar.f17869b) && L.f(this.f17870c, aVar.f17870c) && L.f(this.f17871d, aVar.f17871d) && L.f(this.f17872e, aVar.f17872e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f17873f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17873f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f17873f.f90248c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f17869b.hashCode() * 31, 31, this.f17870c);
        List<String> list = this.f17871d;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f17872e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessfulPlanEvent(advertId=");
        sb2.append(this.f17869b);
        sb2.append(", currentFlow=");
        sb2.append(this.f17870c);
        sb2.append(", plannedVasIds=");
        sb2.append(this.f17871d);
        sb2.append(", strategyId=");
        return C22026a.c(sb2, this.f17872e, ')');
    }
}
