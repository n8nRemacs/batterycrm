package ng0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CronetTcpRstErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419124b;

    public c(@k String str, @k String str2, @k String str3, @l Double d12, @l Double d13, @l String str4, @l String str5, @l String str6, boolean z12, int i12, int i13, @l String str7) {
        Q q12 = new Q("cronet_queried_host", str);
        Q q13 = new Q("cronet_queried_path", str2);
        String string = d12 != null ? d12.toString() : null;
        Q q14 = new Q("geo_lat", string == null ? "" : string);
        String string2 = d13 != null ? d13.toString() : null;
        this.f419124b = new ParametrizedClickStreamEvent(8254, 3, P0.g(q12, q13, q14, new Q("geo_lng", string2 == null ? "" : string2), new Q("carrier_name", str5 == null ? "" : str5), new Q("carrier_numeric_code", str6 == null ? "" : str6), new Q("cronet_error_moment", str3), new Q("cronet_version", str4 == null ? "" : str4), new Q("vpn_active", Boolean.valueOf(z12)), new Q("total_requests_to_host", Integer.valueOf(i12)), new Q("total_failed_requests_to_host", Integer.valueOf(i13)), new Q("http_response_headers", str7 != null ? str7 : "")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f419124b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419124b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f419124b.f90248c;
    }

    @k
    public final String toString() {
        return this.f419124b.i();
    }
}
