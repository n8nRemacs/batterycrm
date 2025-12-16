package ng0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SingleNetworkTaskResultEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng0/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419128b;

    public g(boolean z12, @k String str, @k String str2, boolean z13, @l String str3, @k String str4, @l String str5, @l String str6, @l String str7, @l String str8, boolean z14) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("success", Boolean.valueOf(z12)), new Q("network_type", str), new Q("is_cellular", Boolean.valueOf(z13)), new Q("host", str3 == null ? "" : str3), new Q("administrative_area", str4), new Q("network_protocol", str2), new Q("carrier_name", str6 == null ? "" : str6), new Q("carrier_numeric_code", str7 == null ? "" : str7), new Q("url_definition", str8 != null ? str8 : ""), new Q("is_quic_available", Boolean.valueOf(z14)));
        if (str5 != null) {
            linkedHashMapJ.put("ios_network_error_subtype", str5);
        }
        G0 g02 = G0.f406611a;
        this.f419128b = new ParametrizedClickStreamEvent(12756, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f419128b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419128b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f419128b.f90248c;
    }

    public /* synthetic */ g(boolean z12, String str, String str2, boolean z13, String str3, String str4, String str5, String str6, String str7, String str8, boolean z14, int i12, C42822w c42822w) {
        this(z12, str, str2, z13, str3, str4, (i12 & 64) != 0 ? null : str5, str6, str7, str8, z14);
    }
}
