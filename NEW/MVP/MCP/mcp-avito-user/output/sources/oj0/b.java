package OJ0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.ProfileTab;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: EventUserStatsDetailPeriod.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOJ0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12172b;

    public b(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        this.f12172b = new ParametrizedClickStreamEvent(13374, 1, P0.g(new Q("desc", z12 ? "all_total" : str == null ? ProfileTab.ALL : "column"), new Q("target_page", str2), new Q("iid", str3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f12172b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f12172b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f12172b.f90248c;
    }

    public /* synthetic */ b(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? false : z12);
    }
}
