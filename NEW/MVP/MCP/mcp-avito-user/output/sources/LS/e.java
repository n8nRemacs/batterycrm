package Ls;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmCandidatesGetApplicationsEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLs/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10151b;

    public e(@Y61.l List<String> list, @Y61.l String str, @Y61.l String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            linkedHashMap.put("avito_search_iids", list);
        }
        linkedHashMap.put("avitopro_search_sort_statistic_date_from", str == null ? "" : str);
        linkedHashMap.put("avitopro_search_sort_statistic_date_to", str2 == null ? "" : str2);
        G0 g02 = G0.f406611a;
        this.f10151b = new ParametrizedClickStreamEvent(5960, 5, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f10151b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10151b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f10151b.f90248c;
    }
}
