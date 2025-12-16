package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import qJ.C47304a;

/* compiled from: InAppCallContacted4813.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/F;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415011b;

    public F(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, boolean z12, boolean z13, @Y61.l Boolean bool, @Y61.l Map map, @Y61.l String str4) {
        kotlin.Q q12 = new kotlin.Q("iid", str);
        kotlin.Q q13 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str2);
        kotlin.Q q14 = new kotlin.Q("appcall_scenario", str3);
        kotlin.Q q15 = new kotlin.Q("mic_access", Boolean.valueOf(z12));
        kotlin.Q q16 = new kotlin.Q("camera_permission", Boolean.valueOf(z13));
        C44655b.f419701a.getClass();
        LinkedHashMap linkedHashMapA = C47304a.a(P0.g(q12, q13, q14, q15, q16, C44655b.f419702b, new kotlin.Q("is_iac_only", Boolean.TRUE), new kotlin.Q("iac_only_type", "iac_first"), new kotlin.Q("is_video_call", bool), new kotlin.Q("video_call_type", null), new kotlin.Q("x", C35800g5.b(new C35792f5(null))), new kotlin.Q("iac_tech_info", str4)));
        this.f415011b = new ParametrizedClickStreamEvent(4813, 9, map != null ? P0.k(linkedHashMapA, map) : linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f415011b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415011b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f415011b.f90248c;
    }
}
