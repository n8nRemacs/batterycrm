package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.iac_analytics.public_module.clickstream_events.IacEvent4101;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import oJ.C44655b;
import qJ.C47304a;

/* compiled from: IacCanCallResultEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44281p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415057b;

    public C44281p(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5) {
        Boolean bool = Boolean.TRUE;
        kotlin.Q q12 = new kotlin.Q(IacEvent4101.KEY_CALL_ID, str);
        kotlin.Q q13 = new kotlin.Q("appcall_scenario", str2);
        kotlin.Q q14 = new kotlin.Q("iid", str3);
        C44655b.f419701a.getClass();
        this.f415057b = new ParametrizedClickStreamEvent(5625, 2, C47304a.a(P0.g(q12, q13, q14, C44655b.f419702b, new kotlin.Q("is_iac_only", bool), new kotlin.Q("iac_analytics_info", str4), new kotlin.Q("cancall_result", Boolean.valueOf(z12)), new kotlin.Q("cancall_reason", str5))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f415057b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415057b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f415057b.f90248c;
    }
}
