package OJ;

import Y61.k;
import Y61.l;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: AvCallsNetworkTestEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LOJ/a;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12170b;

    public a(@k String str, @k String str2, @l String str3, @l String str4, @k String str5, boolean z12, boolean z13) {
        this.f12170b = new ParametrizedClickStreamEvent(10170, 2, C35755b0.c(P0.g(new Q("error_text", str4), new Q("iac_network_test_id", str), new Q("iac_network_test_scenario", str2), new Q("iac_network_test_report", str3), new Q("iac_network_test_app_status", C43066x.E0("\n            {\"fg_on_start\":" + z12 + ",\"fg_changed\":" + z13 + ",\"network\":\"" + str5 + "\"}\n        ")))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f12170b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f12170b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f12170b.f90248c;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, boolean z12, boolean z13, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, z12, z13);
    }
}
