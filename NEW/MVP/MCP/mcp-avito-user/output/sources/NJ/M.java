package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import qJ.C47304a;

/* compiled from: ShowCallMethodsEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LnJ/M;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class M implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415023b;

    public M(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Boolean bool) {
        kotlin.Q q12 = new kotlin.Q("iid", str2);
        kotlin.Q q13 = new kotlin.Q("appcall_scenario", str);
        kotlin.Q q14 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str3);
        C44655b.f419701a.getClass();
        this.f415023b = new ParametrizedClickStreamEvent(4097, 5, C47304a.a(P0.g(q12, q13, q14, C44655b.f419702b, new kotlin.Q("is_iac_only", Boolean.TRUE), new kotlin.Q("iac_analytics_info", str4), new kotlin.Q("iac_only_type", "iac_first"), new kotlin.Q("mic_access", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f415023b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415023b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f415023b.f90248c;
    }
}
