package ng0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import okhttp3.Protocol;

/* compiled from: ProtocolSwitchEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng0/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419127b;

    public f(boolean z12, @k String str, @k Protocol protocol, boolean z13, @k String str2, @k String str3, @k Protocol protocol2, @l String str4, @l String str5, @l String str6, boolean z14) {
        this.f419127b = new ParametrizedClickStreamEvent(12773, 1, P0.g(new Q("success", Boolean.valueOf(z12)), new Q("network_type", str), new Q("network_protocol", protocol.name()), new Q("is_cellular", Boolean.valueOf(z13)), new Q("host", str2), new Q("administrative_area", str3), new Q("previous_network_protocol", protocol2.name()), new Q("carrier_name", str4 == null ? "" : str4), new Q("carrier_numeric_code", str5 == null ? "" : str5), new Q("url_definition", str6 != null ? str6 : ""), new Q("is_quic_available", Boolean.valueOf(z14))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f419127b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419127b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f419127b.f90248c;
    }
}
